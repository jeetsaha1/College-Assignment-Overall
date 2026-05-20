package Week3;

import java.util.Scanner;

//13. Write a Java program to check whether a given matrix is sparse or not.
public class prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension(rows, columns): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int[][] arr1 = new int[m][n];

        for(int i = 0; i<m; i++){
            for (int j = 0; j <n; j++){
                System.out.print("Enter the element"+"["+i+"]"+"["+j+"]"+" :");
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<m; i++){
            for (int j = 0; j <n; j++){
                if(arr1[i][j] == 0){
                    count++;
                }
            }
        }

        if((m*n)/2 > count){
            System.out.println("This is not a sparse matrix");
        }
        else{
            System.out.println("This is a sparse matrix");
        }
    }
}
