package function_methods.com;
import java.util.Scanner;
// Chapter 7
// Write a java method to print the multiplication table of a number n
public class prog1 {

    static void table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : " );
        int n = sc.nextInt();
        table(n);
    }
}
