package com.company;

public class CWH_Ch7_Method_overloading {

    static void change(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke(){
        System.out.println("I invented new word.\nPlagiarism!");
    }

    public static void main(String[] args) {
        int [] marks = {100, 200, 300, 400, 500};
        change(marks);
        System.out.println(marks[0]);
    }
}
