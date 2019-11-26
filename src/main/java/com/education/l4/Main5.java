package com.education.l4;

public class Main5 {
    public static void main(String[] args) {
        System.out.println(getCount("2"));
    }

    private static long getCount(String val) {
        return Long.parseLong(val);
    }

    private static long getCount(long val) {
        return val;
    }
}
