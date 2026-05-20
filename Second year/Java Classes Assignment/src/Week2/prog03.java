package Week2;

import java.util.Scanner;

//Write a Java program for Fibonacci series.
public class prog03 {
    static int fibbonaaci(int num){
        if (num == 0){
            return 0;
        }
        else if(num ==1 ||num ==2){
            return  1;
        }
        else{
            return fibbonaaci(num-1) + fibbonaaci(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i = 0; i <= num ; i++){
            System.out.print(" "+fibbonaaci(i)+" ");
        }
    }
}
