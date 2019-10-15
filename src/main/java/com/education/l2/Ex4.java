package com.education.l2;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        String name = "Barsik";

        System.out.println(name.charAt(0));
        System.out.println(name.length());

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        char[] result = new char[3];
        System.out.println();
        name.getChars(1, 4, result, 0);
        System.out.println(result);

        String empty = "";
        System.out.println(empty.isEmpty());
        System.out.println(name.isEmpty());

        System.out.println(name.codePointAt(0));
        char val = 66;
        System.out.println(val);

        byte[] bytes = name.getBytes();
        System.out.println(Arrays.toString(bytes));

        // pool literals
        String name3 = "Barsik";
        String name4 = "BaRsik";

        String name5 = new String("Barsik").intern();
        // 1 NEVER COMPARE STRINGS WITH ==
        System.out.println(name3 == name4);
        System.out.println(name3 == name5);
        // 2
        System.out.println(name3.equals(name4));
        System.out.println(name3.equalsIgnoreCase(name4));
        System.out.println(name3.compareTo(name4));
        System.out.println(name3.compareToIgnoreCase(name4));

        System.out.println(name3.contains("ars"));
        System.out.println(name3.toUpperCase());
        System.out.println(name3.toLowerCase());

        char[] array = name.toCharArray();
        for (char c : array) {
            System.out.println(c);
        }

        System.out.println(name.indexOf("s"));
        name = "BarsiksOfcatsoneone";
        System.out.println(name.lastIndexOf("s"));

        System.out.println(name.indexOf("s", 5));

        name = "Barrrsik";

        // recommend
        System.out.println(name.replace("r", "R"));
        name = "Barrrsik";
        System.out.println(name.replaceAll("r", "R"));

        System.out.println(name.startsWith("Bar"));
        System.out.println(name.endsWith("sik"));
        System.out.println(name.endsWith("si1k"));

        System.out.println("  asd adsa   ".trim());
    }

    private static String getVal() {
        int count = 10;
        return String.valueOf(count);
    }
}
