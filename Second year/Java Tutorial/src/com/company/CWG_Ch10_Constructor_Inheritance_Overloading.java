package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a constructor with value "+a);
    }
    public void meth2(){
        System.out.println("This is Base");
    }
}

class Derived1 extends Base1{
    @Override
    public void meth2(){
        System.out.println("This is Derived");
    }
    Derived1(){
        System.out.println("I am a derived class");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a derived class with value "+y);
    }

}


public class CWG_Ch10_Constructor_Inheritance_Overloading {
    public static void main() {
//        Base1 b = new Base1(2);
        Derived1 d = new Derived1();
        d.meth2();
    }
}
