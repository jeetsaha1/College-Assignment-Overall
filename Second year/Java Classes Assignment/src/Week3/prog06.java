package Week3;

import java.util.Scanner;

//6. Write a Java program to search an element in an array.
public class prog06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        for (int i = 0; i<n; i++){
            if(target == arr[i]){
                System.out.println("The element is found at index "+i);
                break;
            }
        }
    }
}
