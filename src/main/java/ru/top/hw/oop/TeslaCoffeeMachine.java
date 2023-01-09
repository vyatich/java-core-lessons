package ru.top.hw.oop;

import ru.top.hw.oop.common.CoffeeMachine;

public class TeslaCoffeeMachine extends CoffeeMachine {

    public TeslaCoffeeMachine(Integer maxCoffeeWeight, Integer maxWaterVolume, Integer maxPotVolume, Integer coffeeWeight, Integer waterVolume, Integer potVolume) {
        super(maxCoffeeWeight, maxWaterVolume, maxPotVolume, coffeeWeight, waterVolume, potVolume);
    }

}
