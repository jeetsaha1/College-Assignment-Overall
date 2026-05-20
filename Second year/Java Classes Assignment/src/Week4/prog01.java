package Week4;
//1. Write a Java program to implement the concept of inheritance.
class A{
    void display(){
        System.out.println("This is base class");
    }
}
class B extends A{
    void show(){
        System.out.println("This is child class");
    }
}
public class prog01 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.display();
    }
}
