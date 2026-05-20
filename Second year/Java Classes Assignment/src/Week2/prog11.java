package Week2;

import java.util.Scanner;

//Write a Java program to find LCM of two Numbers.
public class prog11 {
    static int HCF(int a, int b){
        while(b !=  0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The LCM : " + (a*b)/HCF(a,b));
    }
}
