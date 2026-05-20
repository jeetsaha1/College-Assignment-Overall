package Week1;

//Write a Java program for following grading system.
//
//Note:
//Percentage ≥ 90% : Grade A
//Percentage ≥ 80% : Grade B
//Percentage ≥ 70% : Grade C
//Percentage ≥ 60% : Grade D
//Percentage ≥ 40% : Grade E
//Percentage < 40% : Grade F

import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int ch = num/10;
        switch (ch){
            case 9:
                System.out.println("Garde A");
                break;
            case 8:
                System.out.println("Garde B");
                break;
            case 7:
                System.out.println("Garde C");
                break;
            case 6:
                System.out.println("Garde D");
                break;
            case 5,4:
                System.out.println("Garde E");
                break;
            case 3,2,1,0:
                System.out.println("Garde F");
                break;
            default:
                System.out.println("Wrong input, Try again");
                break;
        }
    }
}
