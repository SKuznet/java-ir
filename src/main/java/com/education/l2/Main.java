package com.education.l2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Cat[] array2 = new Cat[10];

        Object[] arrayName = array2;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
