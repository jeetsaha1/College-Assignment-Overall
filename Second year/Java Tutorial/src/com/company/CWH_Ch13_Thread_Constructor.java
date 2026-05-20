package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank u");

            System.out.println(" am a thread");

    }
}

public class CWH_Ch13_Thread_Constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Harry");
        t.start();
        System.out.println("The id of the thread t is : " + t.getName());

        System.out.println("The id of the thread t is : " + t.getId());
    }
}
