package ru.top.practic.oop.nestedAndInner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(new Car.Rule("msg"));
        car.setRule(new Car.Rule("message another"));
        car.getRule().printMsg();
    }
}
