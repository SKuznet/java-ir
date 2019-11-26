package com.education.l4;

public class Main3 {
    public static void main(String[] args) {
        FunctionalInterface2 functionalInterface2 = new FunctionalInterface2() {
            @Override
            public void getCount() {
                System.out.println("count is 2");
            }
        };

        FunctionalInterface2 func = () -> System.out.println("Attata  is 2");
        functionalInterface2.getCount();
        func.getCount();
    }
}
