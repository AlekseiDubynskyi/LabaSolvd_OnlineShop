package com.solvd.onlineshop.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    private static final int PULL_QUANTITY = 3;

    public static void main(String[] args) {
        Runnable connectionPool1 = new Task("Pool 1");
        Runnable connectionPool2 = new Task("Pool 2");
        Runnable connectionPool3 = new Task("Pool 3");
        Runnable connectionPool4 = new Task("Pool 4");
        Runnable connectionPool5 = new Task("Pool 5");
        Runnable connectionPool6 = new Task("Pool 6");

        ExecutorService pool = Executors.newFixedThreadPool(PULL_QUANTITY);

        pool.execute(connectionPool1);
        pool.execute(connectionPool2);
        pool.execute(connectionPool3);
        pool.execute(connectionPool4);
        pool.execute(connectionPool5);
        pool.execute(connectionPool6);

        pool.shutdown();
    }
}

