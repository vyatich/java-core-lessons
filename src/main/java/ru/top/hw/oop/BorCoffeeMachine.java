package ru.top.hw.oop;

import ru.top.hw.oop.common.NewCoffeeMachine;

public class BorCoffeeMachine extends NewCoffeeMachine {

    public BorCoffeeMachine(Integer maxCoffeeWeight, Integer maxWaterVolume, Integer maxPotVolume, Integer coffeeWeight, Integer waterVolume, Integer potVolume, Integer maxMilkVolume, Integer milkVolume) {
        super(maxCoffeeWeight, maxWaterVolume, maxPotVolume, coffeeWeight, waterVolume, potVolume, maxMilkVolume, milkVolume);
    }
}
