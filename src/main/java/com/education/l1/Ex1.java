package com.education.l1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex1 {
    Byte aByte = null;
    Short aShort;
    Integer integer;
    Long aLong;

    Float aFloat;
    Double aDouble;

    Character character;

    Boolean aBoolean;

    BigInteger a;
    // for finance
    BigDecimal bigDecimal;

    public static void main(String[] args) {
        int val = 3;

        long val2 =(long) val;

        Short count1 = 127;
        Short count2 = 127;

        // true
        System.out.println(count1 == count2);

        Short count3 = 128;
        Short count4 = 128;
        // false
        System.out.println(count3 == count4);

        Long count5 = -129L;
        Long count6 = -129L;

        System.out.println(count5 == count6);

        System.out.println(count5.equals(count6));
    }
}
