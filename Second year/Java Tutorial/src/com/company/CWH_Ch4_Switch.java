package com.company;
import java.util.Scanner;
public class CWH_Ch4_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        switch (age){
            case 56:
                System.out.println("You are experienced");
                break;
            case 46:
                System.out.println("You are semi-experienced");
                break;
            case 36:
                System.out.println("You are semi-semi-experienced");
                break;
            case 26:
                System.out.println("You are semi-semi-semi-experienced");
                break;
            default:
                System.out.println("Enjoy your life");
        }
//        if (age > 56){
//            System.out.println("You are experienced");
//        }
//        else if (age > 46){
//            System.out.println("You are semi-experienced");
//        }
//        else if (age > 36){
//            System.out.println("You are semi-semi-experienced");
//        }
//        else{
//            System.out.println("You are not experienced");
//        }
    }
}
