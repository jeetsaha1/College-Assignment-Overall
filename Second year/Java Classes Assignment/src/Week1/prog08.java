package Week1;

import java.util.Scanner;

//Write a Java Program to check if a number is Positive or Negative.
public class prog08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
