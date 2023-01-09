package ru.top.hw.oop.common;

import ru.top.hw.oop.interfaces.AmericanoInterface;
import ru.top.hw.oop.interfaces.SimpleCoffeeMachineInterface;

public abstract class SimpleCoffeeMachine extends BaseCoffeeMachine implements SimpleCoffeeMachineInterface {

    protected final Integer maxMilkVolume;
    protected final Integer maxGrainCoffeeWeight;
    protected Integer milkVolume;
    protected Integer grainCoffeeWeight;

    public SimpleCoffeeMachine(Integer maxCoffeeWeight, Integer maxWaterVolume, Integer maxPotVolume, Integer coffeeWeight, Integer waterVolume, Integer potVolume, Integer maxMilkVolume, Integer maxGrainCoffeeWeight, Integer milkVolume, Integer grainCoffeeWeight) {
        super(maxCoffeeWeight, maxWaterVolume, maxPotVolume, coffeeWeight, waterVolume, potVolume);
        this.maxMilkVolume = maxMilkVolume;
        this.maxGrainCoffeeWeight = maxGrainCoffeeWeight;
        this.milkVolume = milkVolume;
        this.grainCoffeeWeight = grainCoffeeWeight;
    }

    @Override
    public void doAmericano() {
        on();
        doCoffee();
        off();
    }

    @Override
    public void doLatte(Integer milkVolume) {
        on();
        doCoffee(milkVolume);
        off();
    }

    private void doCoffee() {
        if (potVolume > maxPotVolume) {
            potIsFull();
            clearPot();
            return;
        }
        if (coffeeWeight < AmericanoInterface.AMERICANO_COFFEE_WEIGHT) {
            noCoffee();
            if (grainCoffeeWeight >= AMERICANO_COFFEE_WEIGHT) {
                grindingCoffee(AMERICANO_COFFEE_WEIGHT);
            } else {
                return;
            }
        }
        if (waterVolume < AmericanoInterface.AMERICANO_WATER_VOLUME) {
            noWater();
            return;
        }
        coffeeWeight = coffeeWeight - AmericanoInterface.AMERICANO_COFFEE_WEIGHT;
        waterVolume = waterVolume - AmericanoInterface.AMERICANO_WATER_VOLUME;
        potVolume = potVolume + AmericanoInterface.AMERICANO_COFFEE_WEIGHT;
        System.out.printf("%s приготовлен\n", "Американо");
    }

    private void grindingCoffee(Integer needGrainCoffeeWeight) {
        System.out.println("Начинаем молоть кофе");
        coffeeWeight = coffeeWeight + needGrainCoffeeWeight;
        grainCoffeeWeight = grainCoffeeWeight - needGrainCoffeeWeight;
    }

    protected void doCoffee(Integer needMilkVolume) {
        if (potVolume > maxPotVolume) {
            potIsFull();
            clearPot();
            return;
        }
        if (milkVolume < needMilkVolume) {
            noMilk();
            return;
        }
        if (coffeeWeight < LATTE_COFFEE_WEIGHT) {
            noCoffee();
            if (grainCoffeeWeight >= LATTE_COFFEE_WEIGHT) {
                grindingCoffee(LATTE_COFFEE_WEIGHT);
            } else {
                return;
            }
        }
        if (waterVolume < LATTE_WATER_VOLUME) {
            noWater();
            return;
        }
        coffeeWeight = coffeeWeight - LATTE_COFFEE_WEIGHT;
        waterVolume = waterVolume - LATTE_WATER_VOLUME;
        potVolume = potVolume + LATTE_COFFEE_WEIGHT;
        milkVolume = maxMilkVolume - needMilkVolume;
        System.out.printf("%s приготовлен\n", "Капучино");
    }

    public void noMilk() {
        System.out.println("Отсутствует молоко");
    }

    @Override
    public void noGrainCoffee() {
        System.out.println("Отсутствует зерновой кофе");
    }
}
