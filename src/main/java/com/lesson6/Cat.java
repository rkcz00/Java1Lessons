package com.lesson6;

public class Cat extends Animal {


    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int a) {
        if (a <= 200) {
            System.out.println(this.name + " пробежал " + a + " м");
        } else {
            System.out.println("Кот не может пробежать больше 200 метров");
        }
    }

    @Override
    public void swim(int b) {
        System.out.println("Коты не умеют плавать!");
    }

    public void swim() {
        System.out.println("Коты не умеют плавать!");
    }


}

