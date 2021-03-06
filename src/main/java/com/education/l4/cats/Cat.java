package com.education.l4.cats;

public class Cat {
    private String name;
    private boolean isHungry;
    private boolean isHerbivore;

    public Cat(String name, boolean isHungry, boolean isHerbivore) {
        this.name = name;
        this.isHungry = isHungry;
        this.isHerbivore = isHerbivore;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", isHungry=" + isHungry +
                ", isHerbivore=" + isHerbivore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }
}
