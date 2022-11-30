package ru.top.oop.inheritance;

public class Main {

    static String line;

    public static void main(String[] args) {
        if (line instanceof String) {
            System.out.println("It's String");
        }
        MagicBook magicBook = new MagicBook("", "sdfsdf", 50, "dsfsdf");

        Book book = new Book("Пушкин", "Руслан и Людмила", 50);
        Book book2 = new Book("Пушкин", "Руслан и Людмила", 50);
        System.out.println(book);

        AbsExampleImpl absExample = new AbsExampleImpl();
        System.out.println(absExample.age);
        absExample.printJavaString();
    }
}
