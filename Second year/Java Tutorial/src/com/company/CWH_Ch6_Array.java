package com.company;

public class CWH_Ch6_Array {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks [0] = 100;
        marks [1] = 200;
        marks [2] = 300;
        marks [3] = 400;
        marks [4] = 500;
//        marks [5] = 600;--> throws an error
        for (int element : marks){
            System.out.println(element);
        }
    }

}
