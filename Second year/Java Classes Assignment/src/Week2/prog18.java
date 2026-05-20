package Week2;
import java.util.Scanner;
//Write a program to compute the value of Euler’s number that is used as the base of natural logarithms. Use the following formula:
//
//e = 1 + 1/1! + 1/2! + 1/3! + …… + 1/n!
public class prog18 {
    static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double e = 1.0;
        for (int i = 1; i <= n; i++) {
            e += 1.0 / fact(i);
        }

        System.out.println("e = " + e);
    }
}
