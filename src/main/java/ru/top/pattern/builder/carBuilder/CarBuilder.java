package ru.top.pattern.builder.carBuilder;

public interface CarBuilder {

    CarBuilder model(String model);

    CarBuilder maxVelocity(Integer maxVelocity);

    Car build();
}
