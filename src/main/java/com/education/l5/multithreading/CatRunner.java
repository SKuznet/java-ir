package com.education.l5.multithreading;

public class CatRunner extends Thread {
    @Override
    public void run() {
        System.out.println("I am run in " + Thread.currentThread().getName());
    }
}
