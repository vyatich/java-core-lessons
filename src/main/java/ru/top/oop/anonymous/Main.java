package ru.top.oop.anonymous;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("From printable");
            }
        };
        printable.print();
        printer.printFromAbstract(new AbstractPrinter() {
            @Override
            void print() {
                System.out.println("Into abstract");
            }
        });
    }
}
