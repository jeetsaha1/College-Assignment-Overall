package Week3;

import java.util.Scanner;

//12. Write a Java program to print transpose of matrix.
public class prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension: ");
        int n = sc.nextInt();
        int[][] trans = new int[n][n];
        int[][] arr1 = new int[n][n];

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                System.out.print("Enter the element"+"["+i+"]"+"["+j+"]"+" :");
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                trans[i][j] = arr1[j][i];
            }
        }

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                System.out.print(" " + trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
