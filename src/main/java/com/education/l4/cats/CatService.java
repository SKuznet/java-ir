package com.education.l4.cats;

public class CatService {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", true, true);
        Cat murzik = new Cat("Murzik", true, false);

        CheckCat checkCat = new CheckCat() {
            @Override
            public boolean check(Cat cat) {
                return cat.isHungry();
            }
        };

        checkCatStatus(barsik, checkCat);

        checkCatStatus(barsik, cat -> cat.isHungry());
        checkCatStatus(barsik, cat -> cat.isHerbivore());
        checkCatStatus(murzik, cat -> cat.isHerbivore());
        checkCatStatus(murzik, cat -> cat.isHungry());

        checkCatStatus(barsik, () -> true);
    }

    private static void checkCatStatus(Cat cat, CheckCat checkCat) {
        if (checkCat.check(cat)) {
            System.out.println(cat);
        }
    }

    private static void checkCatStatus(Cat cat, CatUtilI catUtilI) {
        if (catUtilI.check()) {
            System.out.println(cat);
        }
    }
}
