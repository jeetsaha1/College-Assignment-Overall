package Week3;
//1. Write a Java program to calculate Sum & Average of an integer array.
public class prog01 {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        int sum = 0;
        for (int i= 0; i< 5; i++){
            sum+= marks[i];
        }
        System.out.println("The sum of the array : " + sum);
        System.out.println("The Average of the array : " + sum/5);

    }
}
