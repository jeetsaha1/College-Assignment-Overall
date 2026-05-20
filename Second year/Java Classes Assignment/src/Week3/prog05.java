package Week3;

import java.util.Scanner;

//5. Write a Java program to find the range of a 1D array.
public class prog05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 0; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("The range of the array : " + max +" " + min );
    }
}
