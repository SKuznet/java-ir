package com.education.l6;

import java.util.Random;

public class Main {

    // содержит ли каждый третий элемент массива число 6 - и если содержит добавить в count - и вывести count

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(10);

        int[] array1 = new int[10000000];
        for (int i = 0; i <array1.length ; i++) {
            array1[i] = random.nextInt(100000) + 1;
        }

        int[] array2 = new int[10000000];
        for (int i = 0; i <array2.length ; i++) {
            array2[i] = random.nextInt(100000) + 1;
        }

        Main main = new Main();
        main.getNumberByDigitStringR(array1);
        main.getNumberByDigit(array2);
    }

    public int getNumberByDigitStringR(int[] array) {
        long before = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (String.valueOf(val).contains("4")) {
               count++;
            }
        }
        System.out.println("String count - " + count);
        System.out.println("String realization spent: " + (System.currentTimeMillis() - before));
        return count;
    }

    public int getNumberByDigit(int[] array) {
        long before = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int digitNumberCount = (int) Math.log10(value);
            int k = value;
            while (digitNumberCount >= 0) {
                if (k / ((int) Math.pow(10, digitNumberCount)) == 4) {
                   count++;
                }
                k = k % (int) Math.pow(10, digitNumberCount);
                digitNumberCount--;
            }
        }
        System.out.println("Math count - " + count);
        System.out.println("Math logic realization spent: " + (System.currentTimeMillis() - before));
        return count;
    }
}
