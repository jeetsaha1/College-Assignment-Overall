package Week3;

import java.util.Scanner;

//10. Write a Java program to enter n elements in an array and find smallest number among them.
public class prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("The smallest element of the array : " + min);
    }
}
