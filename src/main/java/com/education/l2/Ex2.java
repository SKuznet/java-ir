package com.education.l2;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
