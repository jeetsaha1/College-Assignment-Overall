package Week2;

//Admission to a professional course is subject to the following conditions:
//        (a) marks in Mathematics ≥ 60
//        (b) marks in Physics ≥ 50
//        (c) marks in Chemistry ≥ 40
//        (d) total in all 3 subjects ≥ 200
//        (Or)
//Total in Maths & Physics ≥ 150
//Given the marks in the 3 subjects of n (user input) students, write a program to process the applications to list eligible candidates.

import java.util.Scanner;

public class prog05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of physics: ");
        double phys = sc.nextDouble();
        System.out.println("Enter the number of Chemistry: ");
        double chem = sc.nextDouble();
        System.out.println("Enter the number of Mathematics: ");
        double math = sc.nextDouble();

        double total = phys + chem + math;
        double duo = math + phys;

        if((math >= 60 && phys >= 50 && chem >= 40 & total >= 200)||(duo > 150)){
            System.out.println("You are eligible for the application");
        }
        else{
            System.out.println("You are not eligible for the application");
        }

    }
}
