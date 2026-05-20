package com.company;

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements ChildSampleInterface{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}


public class CWH_Ch11_Inheritance_in_Interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
