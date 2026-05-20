package Week5;

import java.util.Scanner;

//20. Write a program to accept value of apple sales for each day of the week (using array of
//        type float) and then, calculate the average sale of the week.
public class prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of apple sales (per day): ");
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0 ; i < n; i++){
            System.out.println("Enter the sales: ");
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        for (int i = 0 ; i < n; i++){
            sum += arr[i];
        }
        System.out.println("The average of the sales : " + sum/n) ;
    }
}
