package Week1;

import java.util.Scanner;

//Write a Java program to convert miles to kilometers.
public class prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance(in kilometers): ");
        double mile = sc.nextDouble();
        System.out.println("The distance in miles :" + (mile * 1.6093));
    }
}
