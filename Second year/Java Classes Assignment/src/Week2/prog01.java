package Week2;

import java.util.Scanner;

//Write a Java program to check whether a number is Buzz or not.
public class prog01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if( num % 7 == 0 || num % 10 == 7){
            System.out.println(num + " is buzz number");
        }
        else{
            System.out.println(num + " is not buzz number");
        }
    }
}
