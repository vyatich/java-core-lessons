package ru.top.io;

import java.io.*;
import java.util.HashMap;

public class ObjectStreamExample {

    public static void main(String[] args) {
        File fileOutput = new File("D:/JProjects/java214/java-core/example_directory/run/skip/java/output.txt");
        FileINputStreamExample.createNewFileIfNotExist(fileOutput);

        try (InputStream inputStream = new FileInputStream("D:/JProjects/java214/java-core/example_directory/run/skip/java/output.txt");
             OutputStream outputStream = new FileOutputStream("D:/JProjects/java214/java-core/example_directory/run/skip/java/output.txt")) {

            Contact contact = new Contact(1L, "Java SE", null);
            User user = new User(1111L, "Username");
            HashMap<User, Contact> map = new HashMap<>();
            map.put(user, contact);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(map);

            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            HashMap<User, Contact> mapFromBytes = (HashMap<User, Contact>) objectInputStream.readObject();
            System.out.println(mapFromBytes);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
