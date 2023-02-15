package ru.top.pattern.builder.carBuilder;

public class Main {

    public static void main(String[] args) {
        Car car = new CarBuilderImpl()
                .build();

        Car car1 = new CarBuilderImpl()
                .model("Race Car II")
                .build();

        System.out.println(car1);
    }
}
