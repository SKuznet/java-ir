package com.education.l1;

public class HWExample {
    /**
     * 3.1. Вычислить значение логического выражения при следующих значениях логи-
     * ческих величин А, В и С: А = Истина, В = Ложь, С = Ложь:
     * а) А или В;
     * б) А и В;
     * в) В или С.
     */

    // добавляем в особую часть памяти при запуске программы или при первом обращении (к статике мыф обращаемся по имени
    // класса и класс не обязательно должен быть проинициализирован
    private static boolean isA = true;
    private static boolean isB;
    // the same as at top
    private static boolean isC = false;

    // psvm
    public static void main(String[] args) {
        HWExample hw = new HWExample();
        System.out.println(hw.getTaskA(isA, isB));
        System.out.println(hw.getTaskB(isA, isB));
        System.out.println(hw.getTaskC(isB, isC));
    }

    private boolean getTaskC(boolean val1, boolean val2) {
        return val1 || val2;
    }

    private boolean getTaskA(boolean val1, boolean val2) {
        return val1 || val2;
    }

    private boolean getTaskB(boolean val1, boolean val2) {
        return val1 && val2;
    }
}
