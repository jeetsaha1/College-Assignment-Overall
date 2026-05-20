package Week3;

import java.util.Scanner;

//11. Write Java program to find the sum of all odd numbers in a 2D array.
public class prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension: ");
        int n = sc.nextInt();
        int sum = 0;
        int[][] arr1 = new int[n][n];

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                System.out.print("Enter the element"+"["+i+"]"+"["+j+"]"+" :");
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                if(arr1[i][j]%2 != 0){
                    sum += arr1[i][j];
                }
            }
        }

        System.out.println("The sum of the odd numbers in 2D array : " + sum);
    }
}
