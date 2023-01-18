package ru.top.practic.concurrent.practice2;

import java.util.List;
import java.util.function.Function;

public class CalculateThread implements Runnable {

    private final Function<List<Integer>, Number> function;
    private Number result;

    public CalculateThread(Function<List<Integer>, Number> function) {
        this.function = function;
    }

    public Number getResult() {
        return result;
    }

    @Override
    public void run() {
        result = function.apply(Main.numbers);
    }
}
