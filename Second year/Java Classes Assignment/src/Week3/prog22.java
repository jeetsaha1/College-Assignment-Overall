package Week3;

import java.util.Scanner;

//22. Write a Java program to print every alternate number of a given array.
public class prog22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0 ; i< n; i++){
            System.out.println("Enter the elements : ");
            arr[i] = sc.nextInt();
        }
        for(int  i = 0 ; i< n; i +=2){
            System.out.println(" "+arr[i]+" ");
        }
    }
}
