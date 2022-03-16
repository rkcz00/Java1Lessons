package com.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        System.out.println(summ(10, 20));
        check(22222);
        System.out.println(boolCheck(-11));
        printSome("some text", 4);

    }
    private static boolean summ (int a, int b) {
        int c = a + b;
        boolean var;
        if (10 < c && c <= 20) { //не стал менять на упрощение, предложенное Идеей, для наглядности
            var = true;
        } else {
            var = false;
        }
        return var;
    }

    private static void  check (int a) {
        if (a >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    private static boolean boolCheck (int a) {
        boolean var;
        if (a>= 0){
            var = false;
        } else {
            var = true;
        }
        return var;
    }

    private static void printSome (String some, int count ) {
        for (int i = 1; i <= count; i++) {
            System.out.println(some);
        }
    }
}
