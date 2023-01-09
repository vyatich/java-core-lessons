package ru.top.hw.oop.common;

import ru.top.hw.oop.interfaces.CoffeeMachineInterface;

public abstract class BaseCoffeeMachine implements CoffeeMachineInterface {

    protected final Integer maxCoffeeWeight;
    protected final Integer maxWaterVolume;
    protected final Integer maxPotVolume;

    protected Integer coffeeWeight;
    protected Integer waterVolume;
    protected Integer potVolume;

    public BaseCoffeeMachine(Integer maxCoffeeWeight, Integer maxWaterVolume, Integer maxPotVolume, Integer coffeeWeight, Integer waterVolume, Integer potVolume) {
        this.maxCoffeeWeight = maxCoffeeWeight;
        this.maxWaterVolume = maxWaterVolume;
        this.maxPotVolume = maxPotVolume;
        this.coffeeWeight = coffeeWeight;
        this.waterVolume = waterVolume;
        this.potVolume = potVolume;
    }

    @Override
    public void on() {
        System.out.println("Кофемашина включена");
    }

    @Override
    public void off() {
        System.out.println("Кофемашина выключена");
    }

    @Override
    public void clearPot() {
        potVolume = 0;
    }

    @Override
    public void noCoffee() {
        System.out.println("Отсутствует молотое кофе");
    }

    @Override
    public void noWater() {
        System.out.println("Отсутствует вода");
    }

    @Override
    public void potIsFull() {
        System.out.println("Переполнен бак с отработанным кофе");
    }

    public Integer getCoffeeWeight() {
        return coffeeWeight;
    }

    public void setCoffeeWeight(Integer coffeeWeight) {
        this.coffeeWeight = coffeeWeight;
    }

    public Integer getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(Integer waterVolume) {
        this.waterVolume = waterVolume;
    }

    public Integer getPotVolume() {
        return potVolume;
    }

    public void setPotVolume(Integer potVolume) {
        this.potVolume = potVolume;
    }

    public Integer getMaxCoffeeWeight() {
        return maxCoffeeWeight;
    }

    public Integer getMaxWaterVolume() {
        return maxWaterVolume;
    }

    public Integer getMaxPotVolume() {
        return maxPotVolume;
    }
}
