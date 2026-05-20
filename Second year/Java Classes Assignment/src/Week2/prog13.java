package Week2;
import java.util.Scanner;

//Write a Java program to calculate the exponential of a number.
public class prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println("Result = " + result);
    }
}
