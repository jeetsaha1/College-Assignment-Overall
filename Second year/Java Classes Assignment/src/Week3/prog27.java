package Week3;

import java.awt.*;
import java.util.Scanner;

//27. Write a class, Grader, which has an instance variable, score, an appropriate constructor
//and appropriate methods. A method, letterGrade() that returns the letter grade as
//O/E/A/B/C/F.
//Now write a demo class to test the Grader class by reading a score from the user, using
//        it to create a Grader object after validating that the value is not negative and is not
//        greater than 100. Finally, call the letterGrade() method to get and print the grade.
class Grader{
    int score;
    Grader(int score){
        this.score = score;
    }
    String letterGrade(){
        int ch = score/10;
        switch (ch){
            case 10,9:
                return "O";
            case 8:
                return "E";
            case 7:
                return "A";
            case 6:
                return "B";
            case 5:
                return "C";
            case 4,3,2,1:
                return "F";
            default:
                return "Wrong Input";
        }
    }
}
public class prog27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int marks = sc.nextInt();
        if(marks >= 0){
            Grader grade = new Grader(marks);
            System.out.println(grade.letterGrade());
        }
        else{
            System.out.println("The Value is negative");
        }

    }
}
