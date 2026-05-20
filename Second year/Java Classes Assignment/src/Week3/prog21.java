package Week3;

import java.util.Scanner;

//21. Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence.
public class prog21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0 ; i< n; i++){
            System.out.println("Enter the elements : ");
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i< n; i++){
            if (visited[i] == true)
                continue;
            int count = 1;

            for (int j = i+1 ; j< n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[i] = true;
                }
            }

            if(count>1){
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
