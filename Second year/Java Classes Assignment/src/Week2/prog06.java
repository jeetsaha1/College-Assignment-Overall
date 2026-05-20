package Week2;
//Write a Java program to find all roots of a quadratic equation.
import java.util.Scanner;

public class prog06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d;
        double root1, root2;

        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();

        d = b * b - 4 * a * c;   // Discriminant

        if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }
        else if (d == 0) {
            root1 = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root = " + root1);
        }
        else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex");
            System.out.println("Root1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imagPart + "i");
        }
    }
}
