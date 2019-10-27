package com.education.l3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Murzik");

        int oldCapacity = 10;
        int newCapacity = oldCapacity + (oldCapacity >> 1);


    }
}
