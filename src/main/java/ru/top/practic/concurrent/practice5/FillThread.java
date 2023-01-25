package ru.top.practic.concurrent.practice5;

import java.util.Random;

public class FillThread extends Thread {

    @Override
    public void run() {
        synchronized (SyncExample.lock) {
            SyncExample.list = new Random().ints()
                    .limit(10000)
                    .boxed()
                    .toList();
        }
    }
}
