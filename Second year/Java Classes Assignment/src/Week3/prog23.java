package Week3;

import java.util.Scanner;

//23. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write
//a Java program to merge them into single sorted array C that contains every item from
//arrays A & B, in ascending order.
public class prog23 {
    int[] sort(int[] arr1, int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[]res = new int[l1+l2];
        int  i =0,j=0,k=0;
        while (i < l1 && j < l2){
            if(arr1[i] < arr2[j]){
                res[k++] = arr1[i++];
            }
            else{
                res[k++] = arr2[j++];
            }
        }
        while(i< l1){
            res[k++] = arr1[i++];
        }
        while(j< l2){
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog23 class1 = new prog23();
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0 ; i< n; i++){
            System.out.println("Enter the elements : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements : ");
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for(int  i = 0 ; i< m; i++){
            System.out.println("Enter the elements : ");
            arr2[i] = sc.nextInt();
        }

        int[] res = new int[m+n];
        res = class1.sort(arr,arr2);
        for (int i = 0; i < m+n; i++){
            System.out.print(" " + res[i] + " ");
        }
    }
}
