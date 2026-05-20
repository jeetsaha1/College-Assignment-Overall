package Week2;
//Write a Java program to find median of a set of numbers.
import java.util.Scanner;
import java.util.Arrays;
public class prog17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        if (n % 2 == 0)
            System.out.println("Median = " + (a[n/2 - 1] + a[n/2]) / 2.0);
        else
            System.out.println("Median = " + a[n/2]);
    }
}
