package com.education.l5.multithreading;

import java.io.IOException;

public class Volatile {
    private static volatile boolean flag = true;

    public static void main(String[] args) {
        new ThreadFlagReader().start();
        new ThreadFlagSetter().start();
    }


    public static class ThreadFlagReader extends Thread {
        @Override
        public void run() {
            System.err.println("waiting...");

            while (flag) {

            }

            System.err.println("Gogogo...");
        }
    }

    public static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {
            try {
                int val = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            flag = false;

            System.err.println("Flag is down - " + flag);
        }
    }
}
