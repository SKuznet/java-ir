package com.education.l1;

public class Main {
    // 1 byte (-128:127 - 8 bit
//    byte aByte = 0;
    byte aByte;
    // 2 byte - 16 bit
    short aShort = 0;
    // 4 byte - 32 bit
    int anInt = 0;
    // 8 byte - 64 bit
    long aLong = 0;

    float aFloat = 0.0f;
    double aDouble = 0.0d;

    char aChar = '\u0000';

    boolean aBoolean = false;

    public static void main(String[] args) {

    }

    // byte -> short -> int -> long - double
    // char -> int -> float -> double
    private short getSum(short val1, short val2){
        return (short) (val1 + val2);
    }
}
