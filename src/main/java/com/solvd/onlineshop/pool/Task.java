package com.solvd.onlineshop.pool;

import java.time.LocalDateTime;

public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 4; i++) {
                if (i == 0) {
                    System.out.println("Initialization time for"
                            + " the task name: " + name + " = " + LocalDateTime.now());
                } else {
                    System.out.println("Executing time for the task name: " +
                            name + " is " + LocalDateTime.now() + " for the " + i);
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " is completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
