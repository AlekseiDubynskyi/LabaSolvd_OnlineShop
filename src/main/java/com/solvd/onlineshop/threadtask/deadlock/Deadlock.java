package com.solvd.onlineshop.threadtask.deadlock;

public class Deadlock {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Thread t1 = new Thread(new Thread_A(obj1, obj2, obj3, obj4));
        Thread t2 = new Thread(new Thread_B(obj1, obj2, obj3, obj4));
        Thread t3 = new Thread(new Thread_C(obj1, obj2, obj3, obj4));
        Thread t4 = new Thread(new Thread_D(obj1, obj2, obj3, obj4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

