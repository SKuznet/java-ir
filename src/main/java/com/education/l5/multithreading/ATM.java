package com.education.l5.multithreading;

public class ATM {
    private static final Object key = new Object();
    private static volatile int money = 100;

    // key in toilet
    // bottle neck
    private static void getMoney(int amount) {

        // logic

        synchronized (key) {
            if (amount <= money) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money -= amount;
                System.out.println("All Ok! New amount: " + money);
            } else {
                System.out.println("Not enough money!");
            }
        }

        // logic
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.err.println("Mike");
            getMoney(50);
        }).start();

        new Thread(() -> {
            System.err.println("Anna");
            getMoney(50);
        }).start();

        new Thread(() -> {
            System.err.println("John");
            getMoney(50);
        }).start();
    }
}
