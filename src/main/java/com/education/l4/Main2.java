package com.education.l4;

public class Main2 {
    public static void main(String[] args) {
        FunctionalInterfaceEx1 ex1 = new FunctionalInterfaceEx1() {
            @Override
            public String getName(String name) {
                name = name.toUpperCase();
                return "Hello " + name;
            }
        };

        System.out.println(ex1.getName("Barsik"));

        // Лямбда
        FunctionalInterfaceEx1 ex2 = (name) -> {
            // logic
            return "Hello " + name;
        };

    }
}
