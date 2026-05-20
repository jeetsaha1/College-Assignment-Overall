package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i< 400){
            System.out.println("My Thread is running");
            System.out.println("I am Happy");
            i++;
        }

    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i< 400){
            System.out.println("My Thread2 is running");
            System.out.println("I am sad");
            i++;
        }

    }
}

public class CWH_Ch12_Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
