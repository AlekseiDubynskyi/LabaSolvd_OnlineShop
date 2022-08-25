package com.solvd.onlineshop.pool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConnectionPool implements Runnable {
    private String name;

    public ConnectionPool(String string) {
        name = string;
    }

    public void run() {
        try {
            for (int i = 0; i <= 4; i++) {
                if (i == 0) {
                    Date date = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for"
                            + " the pool - " + name + " = " + ft.format(date));
                } else {
                    Date date = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing time for the pool name - " +
                            name + " = " + ft.format(date));
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
