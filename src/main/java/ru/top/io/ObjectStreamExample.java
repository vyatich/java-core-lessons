package ru.top.io;

import java.io.*;
import java.util.HashMap;
import java.util.OptionalLong;
import java.util.Scanner;

public class ObjectStreamExample {

    public static void main(String[] args) {
        File fileOutput = new File("D:/JProjects/java214/java-core/example_directory/run/skip/java/output.txt");
        FileINputStreamExample.createNewFileIfNotExist(fileOutput);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные контакта");
        String contactName = scanner.nextLine();
        System.out.println("Введите имя юзера");
        String userName = scanner.nextLine();

        Contact contact = new Contact(null, contactName, null);
        User user = new User(null, userName);
        writeObjectToFile(user, contact);

        HashMap<User, Contact> fromFile = getFromFile();
        System.out.println(fromFile);
    }

    private static HashMap<User, Contact> getFromFile() {
        try (InputStream inputStream = new FileInputStream("D:/JProjects/java214/java-core/example_directory/run/skip/java/output.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            return (HashMap<User, Contact>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Error in read time from file");
        }
    }

    private static void writeObjectToFile(User user, Contact contact) {
        HashMap<User, Contact> mapFromFile = getFromFile();

        try (OutputStream outputStream = new FileOutputStream("D:/JProjects/java214/java-core/example_directory/run/skip/java/output.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            OptionalLong maxUserId = mapFromFile.keySet()
                    .stream()
                    .map(User::getId)
                    .mapToLong(Long::longValue)
                    .max();

            maxUserId.ifPresentOrElse(value -> user.setId(value + 1), () -> user.setId(1L));

            OptionalLong maxContactId = mapFromFile.values()
                    .stream()
                    .map(Contact::getId)
                    .mapToLong(Long::longValue)
                    .max();

            maxContactId.ifPresentOrElse(value -> contact.setId(value + 1), () -> contact.setId(1L));

            mapFromFile.put(user, contact);

            objectOutputStream.writeObject(mapFromFile);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error in write time from file");
        }
    }
}
