package Week2;
import java.util.Scanner;
//Write a Java program to read two integer values m and n and to decide and print whether m is multiple of n.
public class prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m % n == 0)
            System.out.println("m is multiple of n");
        else
            System.out.println("m is not multiple of n");
    }
}
