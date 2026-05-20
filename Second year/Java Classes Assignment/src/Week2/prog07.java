package Week2;

import java.util.Scanner;

//Write a Java program to calculate the sum of natural numbers up to a certain range.
public class prog07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = sc.nextInt();
        System.out.println("The sum is : " + n*(n+1)/2);
    }
}
