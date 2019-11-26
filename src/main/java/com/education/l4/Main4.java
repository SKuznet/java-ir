package com.education.l4;

public class Main4 {
    public static void main(String[] args) {
        FunctionalInterface3 func = new FunctionalInterface3() {
            @Override
            public Long getSum(long val1, long val2) {
                return val1 + val2;
            }
        };

        FunctionalInterface3 func2 = (val1, val2) -> val1 + val2;

    }
}
