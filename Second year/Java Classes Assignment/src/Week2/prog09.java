package Week2;

import java.util.Scanner;

//Write a Java program to generate multiplication table.
public class prog09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
