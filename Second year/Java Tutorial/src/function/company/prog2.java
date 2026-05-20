package function_methods.com;
import java.util.Scanner;

//Print the following pattern with function
//*
//* *
//* * *
//* * * *

//Also print the pattern
//* * * *
//* * *
//* *
//*

public class prog2 {

    static void pattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_reverse(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The first pattern: ");
        pattern(n);
        System.out.println("The second pattern: ");
        pattern_reverse(n);
    }
}
