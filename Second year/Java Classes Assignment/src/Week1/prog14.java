package Week1;

import java.util.Scanner;

//Write a Java program to check whether a number is divisible by 5 or not.
public class prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println("It is divisible by 5");
        }
        else{
            System.out.println("It is not divisible by 5");
        }
    }
}
