package ru.top.pattern.composite;

public class Main {

    public static void main(String[] args) {
        FlyableCollection flyableCollection = new FlyableCollection();

        Helicopter helicopter = new Helicopter();
        flyableCollection.addFlyable(helicopter);
        flyableCollection.addFlyable(new Airplane());

        flyableCollection.fly();

        flyableCollection.deleteFlyable(helicopter);

        flyableCollection.fly();
    }
}
