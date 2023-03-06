package ru.top.pattern.state;

public class Main {

    public static void main(String[] args) {
        Package pack = new Package();
        pack.currentState();

        pack.nextState();
        pack.currentState();

        pack.previousState();
        pack.currentState();

        pack.nextState();
        pack.currentState();

        pack.nextState();
        pack.currentState();

        pack.nextState();
        pack.currentState();
    }
}
