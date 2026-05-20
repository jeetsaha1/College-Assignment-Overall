package Week1;
import java.util.Scanner;
//Write a Java program to add two numbers.
public class prog02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(("The addition of " + num1 +" and " + num2 + " is " + (num1+num2)));
    }
}
