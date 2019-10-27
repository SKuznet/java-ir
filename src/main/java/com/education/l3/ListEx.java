package com.education.l3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
//
//        for (String element : list) {
//            if (element.equalsIgnoreCase("barsik")) {
//                list.remove(element);
//            }
//        }

        Iterator<String> iterator = list.iterator();
        // until java 8
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase("barsik")) {
                iterator.remove();
            }
        }

//        list.removeIf(s -> s.equalsIgnoreCase("barsik"));
        System.out.println(list);
    }
}
