package com.company;


class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        while(true){
            System.out.println("Thank you" + this.getName());
        }

    }
}

public class CWH_Ch13_Thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Haary1");
        MyThr1 t2 = new MyThr1("Haary2");
        MyThr1 t3 = new MyThr1("Haary3");
        MyThr1 t4 = new MyThr1("Haary4");
        MyThr1 t5 = new MyThr1("Haary5");
        t1.setPriority(Thread.MAX_PRIORITY );
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
