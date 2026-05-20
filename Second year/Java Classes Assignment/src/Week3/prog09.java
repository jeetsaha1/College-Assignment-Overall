package Week3;

import java.util.Scanner;

//9. Reverse the elements in an array of integers without using a second array.
public class prog09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        int t = 0;
        for (int i = 0; i<n/2; i++){
            t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
        for (int i = 0; i<n; i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
