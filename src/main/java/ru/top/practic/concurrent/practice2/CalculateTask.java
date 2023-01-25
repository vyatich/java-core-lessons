package ru.top.practic.concurrent.practice2;

import ru.top.practic.concurrent.practice5.SyncExample;

import java.util.List;
import java.util.function.Function;

public class CalculateTask implements Runnable {

    private final Function<List<Integer>, Number> function;
    private Number result;

    public CalculateTask(Function<List<Integer>, Number> function) {
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
