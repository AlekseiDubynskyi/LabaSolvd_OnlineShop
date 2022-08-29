package com.solvd.onlineshop.threadtask.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    private static final int PULL_QUANTITY = 3;

    public static void main(String[] args) {
        Runnable connectionPool1 = new Pool("Pool 1");
        Runnable connectionPool2 = new Pool("Pool 2");
        Runnable connectionPool3 = new Pool("Pool 3");
        Runnable connectionPool4 = new Pool("Pool 4");
        Runnable connectionPool5 = new Pool("Pool 5");
        Runnable connectionPool6 = new Pool("Pool 6");

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

