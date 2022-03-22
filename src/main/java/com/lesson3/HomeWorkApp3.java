package com.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {

//        arrExc1();
//        createArrExc2();
//        createArrExc3();
 //       createArrExc4();
        int [] arr = arrExc5(4,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrExc1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void createArrExc2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void createArrExc3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void createArrExc4() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i==j) || (i+j == arr.length-1)? 1:0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();


        }
    }

    public static int[] arrExc5(int len, int InitialValue){
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = InitialValue;
        }
        return arr;
    }


}
