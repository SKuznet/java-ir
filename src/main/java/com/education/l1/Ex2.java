package com.education.l1;

public class Ex2 {
    // + += - -= * *= / /=
    // % %= ++ --

    // | or; |= ; &; &=; ^ ^= ~ >> >>= >>> >>>= << <<=

    // || && ! ^
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.isEven(6));
        System.out.println(ex2.isEven(5));

        int i = -1;
        i >>>= 10;

        System.out.println(i);
    }

    private boolean isEven(int count) {
        System.out.println(count++);
        System.out.println(++count);
        return count % 2 == 0;
    }
}
