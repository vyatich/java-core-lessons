package ru.top.pattern.adapter;

public class Client {

    public static void main(String[] args) {

        AdapterInterface adapterInterface = new Adapter(new Source());

        System.out.println(adapterInterface.isGood(2));
    }
}
