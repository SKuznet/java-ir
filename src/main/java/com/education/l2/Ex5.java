package com.education.l2;

public class Ex5 {
    public static void main(String[] args) {
        String val = "Bar" + "sik";
        StringBuffer buffer;
        // equals non-thread-safe quick
        StringBuilder builder = new StringBuilder();
        builder.append("B").append("ars").append("ik");

        System.out.println(builder.toString());

        System.out.println(builder.reverse());
    }

    private static String getVal() {
//        return new StringBuilder().append("Bar").append("sik").toString();
        return "Bar" + "sik";
    }
}
