package Week5;

import java.util.Scanner;

//21. Write program, which finds the sum of numbers formed by consecutive digits.
//        Input : 2415
//output : 24+41+15=80.
public class prog21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 9){
            int last = temp % 10;
            int secLast = (temp / 10)%10;
            int form = (secLast * 10) + last;
            sum+= form;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
