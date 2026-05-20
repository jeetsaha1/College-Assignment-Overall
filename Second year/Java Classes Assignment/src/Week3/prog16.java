package Week3;

import java.util.Scanner;

//16. Write a Java program which counts the non-zero elements in an integer array.
public class prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            System.out.println("Enter the element "+i+" : ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i< n; i++){
            if(arr[i] != 0){
                count++;
            }
        }
        System.out.println("The no. of non zero elements in array : " + count);
    }
}
