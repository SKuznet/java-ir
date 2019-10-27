package com.education.l3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[1] = 4;

        String[] array2 = new String[4];
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));

        double[] array3 = new double[5];
        System.out.println(Arrays.toString(array3));

        int[] rooms = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(rooms));
        int[] rooms2 = {1, 2, 3};
        System.out.println(Arrays.toString(rooms2));

        int[] array4 = new int[2];
        // non with java conv
        int array5[] = new int[2];

        Object[] array6 = new Object[5];
        array6[0] = "Barsik";
        array6[1] = 2;
    }
}
