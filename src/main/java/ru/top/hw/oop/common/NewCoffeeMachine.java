package ru.top.hw.oop.common;

import ru.top.hw.oop.interfaces.NewCoffeeMachineInterface;

public abstract class NewCoffeeMachine extends CoffeeMachine implements NewCoffeeMachineInterface {

    protected final Integer maxMilkVolume;
    protected Integer milkVolume;

    public NewCoffeeMachine(Integer maxCoffeeWeight, Integer maxWaterVolume, Integer maxPotVolume, Integer coffeeWeight, Integer waterVolume, Integer potVolume, Integer maxMilkVolume, Integer milkVolume) {
        super(maxCoffeeWeight, maxWaterVolume, maxPotVolume, coffeeWeight, waterVolume, potVolume);
        this.maxMilkVolume = maxMilkVolume;
        this.milkVolume = milkVolume;
    }

    @Override
    public void doCappuccino(Integer milkVolume) {
        on();
        doCoffee(CAPPUCINO_COFFEE_WEIGHT, CAPPUCINO_WATER_VOLUME, milkVolume, "Капучино");
        off();
    }

    @Override
    public void doLatte(Integer milkVolume) {
        on();
        doCoffee(LATTE_COFFEE_WEIGHT, LATTE_WATER_VOLUME, milkVolume, "Латте");
        off();
    }

    protected void doCoffee(Integer needCoffeeWeight, Integer needWaterVolume, Integer needMilkVolume, String coffeeName) {
        if (potVolume > maxPotVolume) {
            potIsFull();
            clearPot();
            return;
        }
        if (milkVolume < needMilkVolume) {
            noMilk();
            return;
        }
        if (coffeeWeight < needCoffeeWeight) {
            noCoffee();
            return;
        }
        if (waterVolume < needWaterVolume) {
            noWater();
            return;
        }
        coffeeWeight = coffeeWeight - needCoffeeWeight;
        waterVolume = waterVolume - needWaterVolume;
        potVolume = potVolume + needCoffeeWeight;
        milkVolume = maxMilkVolume - needMilkVolume;
        System.out.printf("%s приготовлен\n", coffeeName);
    }

    @Override
    public void noMilk() {
        System.out.println("Отсутствует молоко");
    }
}
