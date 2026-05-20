package Week2;
import java.util.Scanner;
//Write a Java program to display prime numbers between a given interval.
public class prog21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) c++;
            }
            if (c == 2)
                System.out.print(i + " ");
        }
    }
}
