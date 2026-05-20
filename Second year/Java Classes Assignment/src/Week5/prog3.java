package Week5;

//3. Create a class called Complex, which has two private instance variables –real and
//imaginary. It contains a method called add( ) which takes one Complex object as
//parameter and print the added value of the calling Complex object and passes Complex
//object. In the main method, declare two Complex objects and assign values using
//constructor and call the add() method.

import java.util.Scanner;

class Complex{
    private double real;
    private double img;
    Complex(double real,double img){
        this.real = real;
        this.img = img;
    }
    void add(Complex num){
        double totalReal = this.real + num.real;
        double totalImg = this.img + num.img;
        System.out.println(totalReal + " + " + totalImg + " i");
    }
}
public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the complex number : (a+ib)");
        Complex num1 = new Complex(sc.nextDouble(),sc.nextDouble());

        System.out.println("Enter the complex number : (a+ib)");
        Complex num2 = new Complex(sc.nextDouble(),sc.nextDouble());

        num1.add(num2);
    }
}
