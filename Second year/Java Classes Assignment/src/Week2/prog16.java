package Week2;
//Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
import java.util.Scanner;

public class prog16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter Binary Number: ");
        int bin = sc.nextInt();

        int dec = 0, base = 1;

        while (bin > 0) {
            int lastDigit = bin % 10;
            dec += lastDigit * base;
            base *= 2;
            bin /= 10;
        }

        System.out.println("Decimal = " + dec);

        // Decimal to Binary
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        int binary = 0, place = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * place;
            decimal /= 2;
            place *= 10;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}