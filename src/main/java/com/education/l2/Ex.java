package com.education.l2;

import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {
        int[][][] array = new int[3][2][4];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] = count++;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
