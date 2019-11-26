package com.education.l4;

public interface Java8Interface {
    public static final int count = 10;

    default String getName() {
        return "Barsik";
    }

    // since java8
    default String getName2() {
        return "Barsik";
    }

    static void getInfo() {
        System.out.println("I am from java 8 interface!");
    }
}
