package ru.top.hw.oop.common;

import ru.top.hw.oop.interfaces.AmericanoInterface;
import ru.top.hw.oop.interfaces.EspressoInterface;

public abstract class CoffeeMachine extends BaseCoffeeMachine implements EspressoInterface, AmericanoInterface {

    public CoffeeMachine(Integer maxCoffeeWeight, Integer maxWaterVolume, Integer maxPotVolume, Integer coffeeWeight, Integer waterVolume, Integer potVolume) {
        super(maxCoffeeWeight, maxWaterVolume, maxPotVolume, coffeeWeight, waterVolume, potVolume);
    }

    @Override
    public void doEspresso() {
        on();
        doCoffee(ESPRESSO_COFFEE_WEIGHT, ESPRESSO_WATER_VOLUME, "Эспрессо");
        off();
    }

    private void doCoffee(Integer needCoffeeWeight, Integer needWaterVolume, String coffeeName) {
        if (potVolume > maxPotVolume) {
            potIsFull();
            clearPot();
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
        System.out.printf("%s приготовлен\n", coffeeName);
    }

    @Override
    public void doAmericano() {
        on();
        doCoffee(AMERICANO_COFFEE_WEIGHT, AMERICANO_WATER_VOLUME, "Американо");
        off();
    }
}
