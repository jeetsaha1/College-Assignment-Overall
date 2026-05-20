package Week1;

import java.util.Scanner;

//Write a Java program to check whether a year is leap year or not.
public class prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr = sc.nextInt();
        if(yr % 4 == 0 || yr % 400 ==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
