package Week1;

import java.util.Scanner;

//Write a Java program to find maximum of three numbers.
public class prog09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number 3: ");
        int num3 = sc.nextInt();
        if(num1> num2  && num1 > num3){
            System.out.println(num1 + " is max");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is max");
        }
        else{
            System.out.println(num3 + " is max");
        }
    }
}
