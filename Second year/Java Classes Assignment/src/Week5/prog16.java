package Week5;

//16. Write a program that reads ten numbers, computes their average, and finds out how
//many numbers are above the average.

import java.util.Scanner;

class AVG{
    int n;
    int[] arr = new int[n];
    AVG(int[] arr,int n){
        this.arr = arr;
        this.n = n;
    }
    void avgAndMax(){
        int sum = 0;
        for (int i = 0 ; i < n; i++){
            sum += arr[i];
        }
        double avg = sum/n;
        for (int i = 0 ; i < n; i++){
            if(arr[i] > avg){
                System.out.println(arr[i]);
            }
        }
    }
}

public class prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0 ; i < 10; i++){
            System.out.println("Enter the ele: ");
            arr[i] = sc.nextInt();
        }
        AVG avg = new AVG(arr,10);
        avg.avgAndMax();
    }
}
