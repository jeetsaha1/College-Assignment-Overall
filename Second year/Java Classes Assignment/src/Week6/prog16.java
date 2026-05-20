package Week6;
//16. Program to implement the Multiple Inheritance (Exam Interface, Student & Result
//        classes).

interface Exam {
    void inputMarks(int m1, int m2);
}

class Student1 {
    int roll;
    String name;

    Student1(int r, String n) {
        roll = r;
        name = n;
    }
}

class Result extends Student1 implements Exam {

    int mark1, mark2;

    Result(int r, String n) {
        super(r, n);
    }

    public void inputMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + (mark1 + mark2));
    }
}

public class prog16 {
    public static void main(String[] args) {

        Result r = new Result(101, "Jeet");
        r.inputMarks(80, 90);
        r.display();
    }
}