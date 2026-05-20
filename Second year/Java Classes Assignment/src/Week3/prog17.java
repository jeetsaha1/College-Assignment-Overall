package Week3;

import java.util.Scanner;

//17. Write a Java program to merge two float arrays.
public class prog17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first array: ");
        int n = sc.nextInt();
        float[] arr1 = new float[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter the number : ");
            arr1[i] = sc.nextFloat();
        }

        System.out.println("Enter the number of second array: ");
        int m = sc.nextInt();
        float[] arr2 = new float[n];
        for (int i = 0 ; i < m ; i++){
            System.out.println("Enter the number : ");
            arr2[i] = sc.nextFloat();
        }

        float[] merge = new float[m+n];
        int k = 0;
        for(int i = 0; i<n;i++){
            merge[k++] = arr1[i];
        }
        for(int i = 0; i<m;i++){
            merge[k++] = arr2[i];
        }
        for(int i = 0; i<k;i++){
            System.out.print(" " + merge[i] + " ");
        }
    }
}
