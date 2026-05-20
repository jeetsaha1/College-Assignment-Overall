package Week2;

import java.util.Scanner;

//Write a Java program to reverse a number.
public class prog04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int reverse = 0;
        while (num != 0){
            int r = num % 10;
            reverse = reverse * 10 + r;
            num /= 10;
        }
        System.out.println(reverse);
    }

}
