package Week1;

import java.util.Scanner;

//Write a Java program to find area and perimeter of a rectangle.
public class prog05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of height and width : ");
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("The area : " + (height * width));
        System.out.println("The perimeter : " + 2*(height+ width));
    }
}
