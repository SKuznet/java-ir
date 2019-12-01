package com.education.l5;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");

        Predicate<Cat> predicate = new Predicate<Cat>() {
            @Override
            public boolean test(Cat cat) {
                return cat.getName().equalsIgnoreCase("barsik");
            }
        };

        Predicate<Cat> catPredicate = (s) -> s.getName().equalsIgnoreCase("barsik");

        System.out.println("This is my cat:" + catPredicate.test(cat1));
        System.out.println("This is my cat:" + catPredicate.test(cat2));
    }
}
