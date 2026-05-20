package Week6;

interface Exam1 {
    void percent_cal();
}

class Student2 {

    protected String name;
    protected int roll_no;
    protected int marks1;
    protected int marks2;

    Student2(String name, int roll_no, int marks1, int marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class Result1 extends Student2 implements Exam1 {

    double per;

    Result1(String name, int roll_no, int marks1, int marks2) {
        super(name, roll_no, marks1, marks2);
    }

    public void percent_cal() {
        per = (marks1 + marks2) / 2.0;
    }

    void display() {
        System.out.println("Percentage: " + per + "%");
    }
}

public class prog19 {

    public static void main(String[] args) {

        Result1 r = new Result1("Jeet", 101, 80, 90);

        r.show();
        r.percent_cal();
        r.display();
    }
}