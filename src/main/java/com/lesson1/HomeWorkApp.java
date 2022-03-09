package com.lesson1;


public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -5;

        int c = a + b;
        if (c > 0) {
            System.out.println("'Сумма положительная'");
        } else if (c < 0) {
            System.out.println("'Сумма отрицательная'");
        } else if (c == 0) {
            System.out.println("'Сумма равна 0'");
        }

    }

    public static void printColor() {
        int value = 2;

        if (value >= 0) {
            System.out.println("'Красный'");
        } else if (0 < value && value <= 100) {
            System.out.println("'Желтый'");
        } else {
            System.out.println("'Зеленый'");
        }
    }

    public static void compareNumbers() {
        int a = 0;
        int b = -1;

        if (a >= b) {
            System.out.println("'a >= b'");
        } else {
            System.out.println("'a < b'");
        }
    }
}
