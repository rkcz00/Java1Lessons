package com.lesson6;

public class Dog extends Animal {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int a) {
        if (a <= 500) {
            System.out.println(this.name + " пробежал " + a + " м");
        } else {
            System.out.println("Собака не может пробежать больше 500 метров");
        }
    }

    @Override
    public void swim(int b) {
        if (b <= 10) {
            System.out.println(this.name + " проплыл " + b + " м");
        } else {
            System.out.println("Собака не может проплыть больше 10 метров");
        }
    }

}
