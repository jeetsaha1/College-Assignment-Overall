package Week5;

//17. Write a program that reads ten integers and displays them in the reverse of the order in
//which they were read.

import java.util.Scanner;

public class prog17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0 ; i < 10; i++){
            System.out.println("Enter the ele: ");
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[10];
        for (int i = 0 ; i < 10; i++){
            arr1[10-i-1] = arr[i];
        }
        for (int i = 0 ; i < 10; i++){
            System.out.println(arr1[i]);
        }
    }
}
