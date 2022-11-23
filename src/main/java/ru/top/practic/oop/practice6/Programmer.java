package ru.top.practic.oop.practice6;

public class Programmer extends Worker {

    @Override
    public void print() {
        System.out.println("Я - " + this.getClass().getSimpleName());
    }
}
