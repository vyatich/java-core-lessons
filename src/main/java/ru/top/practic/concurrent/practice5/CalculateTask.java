package ru.top.practic.concurrent.practice5;

import ru.top.practic.concurrent.practice2.Main;

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
        synchronized (SyncExample.lock) {
            result = function.apply(SyncExample.list);
        }
    }
}
