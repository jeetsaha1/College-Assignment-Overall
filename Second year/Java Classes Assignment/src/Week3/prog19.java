package Week3;

import java.util.Scanner;

//19. Write a Java program to multiply two matrices.
public class prog19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension: ");
        int n = sc.nextInt();
        int sum = 0;
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] res = new int[n][n];

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                System.out.print("Enter the element"+"["+i+"]"+"["+j+"]"+" :");
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                System.out.print("Enter the element"+"["+i+"]"+"["+j+"]"+" :");
                arr2[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                for(int k = 0;k <n; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                res[i][j] = sum;
            }
        }

        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++){
                System.out.print(" "+res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
