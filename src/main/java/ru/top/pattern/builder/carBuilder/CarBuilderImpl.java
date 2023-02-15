package ru.top.pattern.builder.carBuilder;

public class CarBuilderImpl implements CarBuilder {

    private String model;
    private Integer maxVelocity;

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder maxVelocity(Integer maxVelocity) {
        this.maxVelocity = maxVelocity;
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car();
        car.setModel(this.model);
        car.setMaxVelocity(this.maxVelocity);
        return car;
    }
}
