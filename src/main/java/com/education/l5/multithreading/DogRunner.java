package com.education.l5.multithreading;

public class DogRunner implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog from " + Thread.currentThread().getName());
    }
}
