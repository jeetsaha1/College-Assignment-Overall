package function_methods.com;
import java.util.Scanner;

//Also print the pattern
//* * * *
//* * *
//* *
//*

// Should be print with recursion


public class prog5 {

    static void pattern(int n){
        if(n == 0)
            return ;

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern(n);
    }
}
