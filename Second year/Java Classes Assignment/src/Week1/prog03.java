package Week1;

import java.util.Scanner;

//Write a Java program to change temperature from Celsius to Fahrenheit.
public class prog03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature (In Celsius):");
        double cel = sc.nextDouble();
        double fer = (cel * 9 / 5) + 32;
        System.out.println("The temperature (in Fahrenheit) : " + fer);
    }
}
