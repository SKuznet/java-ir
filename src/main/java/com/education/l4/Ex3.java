package com.education.l4;

public class Ex3 {
    public static void main(String[] args) {
        CatService catService = new CatServiceImpl(); // становится безымянным
        CatService catService1 = new CatService() {
            @Override
            public void getSound() {
                System.out.println("lalala");
            }

            @Override
            public String getName() {
                return null;
            }
        };

        catService1.getName();
    }
}
