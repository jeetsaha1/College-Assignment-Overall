package Week2;

import java.util.Scanner;

//Write a Java program to print all multiples of 10 between a given interval.
public class prog08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++){
            if(i%10 == 0){
                System.out.print(" " + i + " ");
            }
        }
    }
}
