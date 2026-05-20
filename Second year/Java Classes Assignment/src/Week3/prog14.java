package Week3;

import java.util.Scanner;

//14. Write a Java program to count the prime numbers in an array.
public class prog14 {
    boolean isPrime(int n){
        if(n<= 1){
            return false;
        }
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog14 class1 = new prog14();
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n; i++){
            System.out.println("Enter the element  " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i< n; i++){
            if(class1.isPrime(arr[i])){
                count++;
            }
        }
        System.out.println("The no. of prime no. : " + count);
    }
}
