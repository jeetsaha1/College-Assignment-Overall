package Week2;
import java.util.Scanner;
//Write a Java program to check whether a number is palindrome or not.
public class prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
