package Week1;

import java.util.Scanner;

//Write a Java program to swap two numbers.
public class prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = sc.nextInt();
        int t = num1;
        num1 = num2;
        num2 = t;
        System.out.println("The number 1: " + num1) ;
        System.out.println("The number 2: " + num2);
    }
}
