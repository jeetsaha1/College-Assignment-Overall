package Week1;

import java.util.Scanner;

//Write a Java program to change temperature from Fahrenheit to Celsius.
public class prog04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature (In Fahrenheit):");
        double fer = sc.nextDouble();
        double cel = (fer - 32)/9*5;
        System.out.println("The temperature (in Celsius) : " + cel);
    }
}
