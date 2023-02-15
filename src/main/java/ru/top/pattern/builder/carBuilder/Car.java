package ru.top.pattern.builder.carBuilder;

public class Car {

    private String model;
    private Integer maxVelocity;

    private Integer weight;

    public Car(String model, Integer maxVelocity, Integer weight) {
        this.model = model;
        this.maxVelocity = maxVelocity;
        this.weight = weight;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(Integer maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String sb = "Car{" + "model='" + model + '\'' +
                ", maxVelocity=" + maxVelocity +
                ", weight=" + weight +
                '}';
        return sb;
    }
}
