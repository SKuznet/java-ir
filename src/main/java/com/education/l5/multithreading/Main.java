package com.education.l5.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread thread7 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Мы уже приехали?");
            }
        });
        thread7.setDaemon(true);
        thread7.start();

        System.out.println("I am run in " + Thread.currentThread().getName());
        Thread thread1 = new Thread(new CatRunner());
        thread1.setName("IAmThread");
        Thread thread2 = new Thread(new CatRunner());
        Thread thread3 = new Thread(new CatRunner());
        thread1.start();
        thread2.start();
        thread3.start();

        Thread thread4 = new Thread(new DogRunner());
        thread4.start();

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello " + Thread.currentThread().getName());
            }
        });
        thread5.start();

        Thread thread6 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello with lyambda " + Thread.currentThread().getName());
        });
        thread6.start();
    }
}
