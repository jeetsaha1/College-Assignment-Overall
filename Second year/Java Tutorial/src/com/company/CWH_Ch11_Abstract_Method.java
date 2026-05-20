package com.company;

abstract class parent2{
    public parent2(){
        System.out.println("Main base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class child3 extends parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class CWH_Ch11_Abstract_Method {
    public static void main(String[] args) {
        child2 c = new child2();
    }
}
