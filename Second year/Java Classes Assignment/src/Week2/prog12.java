package Week2;

import java.util.Scanner;

//Write a Java program to count the number of digits of an integer.
public class prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }


        System.out.println("The number of digits: " + count);
    }
}
