package function_methods.com;
import java.util.Scanner;

// To calculate first n natural numbers (using recursion)

public class prog3 {

    static int sum(int n){
        if (n == 0)
            return 0;
        else
            return n+ sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The sum of the number 1 to "+num+" is : "+sum(num));
    }
}
