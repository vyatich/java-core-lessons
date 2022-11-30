package ru.top.oop.anonymous;

public class Printer {

    public void printList(Printable printable) {
        printable.print();
    }

    public void printFromAbstract(AbstractPrinter abstractPrinter) {
        abstractPrinter.print();
    }
}
