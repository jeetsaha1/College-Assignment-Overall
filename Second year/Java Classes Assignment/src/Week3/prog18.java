package Week3;

import java.util.Scanner;

//18. Write a Java program where elements of two integer arrays get added index wise and
//get stored into a third array.
public class prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter the number : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of first array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0 ; i < m ; i++){
            System.out.println("Enter the number : ");
            arr2[i] = sc.nextInt();
        }

        float[] merge = new float[Math.max(m,n)];
        int k = 0;
        for(int i = 0; i<n;i++){
            merge[k++] = arr1[i]+arr2[i];
        }

        for(int i = 0; i<k;i++){
            System.out.print(" " + merge[i] + " ");
        }
    }
}
