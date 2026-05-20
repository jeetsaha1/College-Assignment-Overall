package Week3;

import java.util.Scanner;

//15. Write a Java program to find second highest element of an array.
public class prog15 {
    void bubbleSort(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        prog15 class1 = new prog15();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n; i++){
            System.out.println("Enter the element  " + i + ": ");
            arr[i] = sc.nextInt();
        }
        class1.bubbleSort(arr,n);
        System.out.println(arr[1]);
    }
}
