package com.solvd.onlineshop.threadtask.deadlock;

import java.time.LocalDateTime;

class Thread_D implements Runnable {
    private Object obj1;
    private Object obj2;
    private Object obj3;
    private Object obj4;

    public Thread_D(Object obj1, Object obj2, Object obj3, Object obj4) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
        this.obj4 = obj4;
    }

    @Override
    public void run() {
        synchronized (obj4) {
            System.out.println(Thread.currentThread().getName() + " acquired " + "obj4 lock for: " + LocalDateTime.now());
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName() + " acquired " + "obj1 lock for: " + LocalDateTime.now());
                synchronized (obj2) {
                    System.out.println(Thread.currentThread().getName() + " acquired " + "obj2 lock for: " + LocalDateTime.now());
                    synchronized (obj3) {
                        System.out.println(Thread.currentThread().getName() + " acquired " + "obj3 lock for: " + LocalDateTime.now());
                    }
                }
            }
        }
    }
}
