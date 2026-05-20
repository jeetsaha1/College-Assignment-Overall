package Week3;

import java.util.Scanner;

//7. Write a Java program to find the sum of even numbers in an integer array.
public class prog07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i = 0; i<n; i++){
            if(arr[i]%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("The sum of the even numbers : " + sum);
    }
}
