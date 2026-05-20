package Week1;

import java.util.Scanner;

//Write a Java program to find area and perimeter of a circle.
public class prog06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of radius : ");
        double rad = sc.nextDouble();
        double pi = 3.14159;
        System.out.println("The area : " + (pi * rad * rad));
        System.out.println("The perimeter : " + 2*(pi * rad));
    }
}

