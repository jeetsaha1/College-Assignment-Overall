package Week5;
//5. Write a program to define a class Student with four data members such as name, roll
//        no., sub1, and sub2. Define appropriate methods to initialize and display the values of
//data members. Also calculate total marks and percentage scored by student.

class Student{
    private String name;
    private int roll;
    private double sub1;
    private double sub2;
    Student(String name, int roll, double sub1, double sub2){
        this.name = name;
        this.roll = roll;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    void display(){
        System.out.println("===========Student Details=============\n" +
                "Name : " + name +"\n" +
                "Roll : " + roll +"\n" +
                "Sub1 marks : " + sub1 +"\n" +
                "Sub2 marks : " + sub2 +"\n");
    }
    void totalMarks(){
        System.out.println("Total marks : " + (sub1 + sub2));
    }
    void percentage(){
        System.out.println("Percentage : "+((sub1+sub2)/2));
    }
}
public class prog5 {
    public static void main(String[] args) {
        Student s1 = new Student("Jeet", 101, 85, 90);
        s1.display();
        s1.totalMarks();
        s1.percentage();
    }
}
