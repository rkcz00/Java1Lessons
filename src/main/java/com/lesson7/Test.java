package com.lesson7;

public class Test {

    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 5);
        allCats[1] = new Cat("Снежок", 30);
        allCats[2] = new Cat("Мурзик", 10);
        allCats[3] = new Cat("Чернышка", 45);

        Plate plate = new Plate(10);

        plate.info();

        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].isSatiety() == false && allCats[i].getAppetite() < plate.getFood()){
                allCats[i].eat(plate);
                allCats[i].setSatiety(true);
                System.out.println("Кот " + allCats[i].getName() + " поел");
            } else {
                System.out.println("Кот " + allCats[i].getName() + " не поел");
            }
        }



    }
}
