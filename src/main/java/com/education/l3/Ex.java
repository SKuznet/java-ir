package com.education.l3;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    // Collection Map
    public static void main(String[] args) {
//        Collection Map
//        Set<String> set = new HashSet<>();
//        set.add("Barsik");
//        set.add("Barsik");
//        set.add("Barsik");
//        set.add("Murzik");
//
//        System.out.println(set);
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("Barsik", "Good");
        Cat murzik = new Cat("Murzik", "Hungry");
        Cat snegok = new Cat("Snegok", "Happy");
        set.add(barsik);
        set.add(murzik);
        set.add(snegok);
        System.out.println(barsik.hashCode());
        System.out.println(murzik.hashCode());
        System.out.println(snegok.hashCode());
        System.out.println(set);
        System.out.println(set.contains(barsik));

        barsik.setDescription("Angry");
        System.out.println(barsik.hashCode());
        System.out.println(set.contains(barsik));
        set.add(barsik);
        System.out.println(set);

        Set<Cat> set2 = new HashSet<>();
        Cat yukki = new Cat("Yukki", "Strong");
        set2.add(yukki);

        set2.addAll(set);

        System.out.println(set2);

    }
}
