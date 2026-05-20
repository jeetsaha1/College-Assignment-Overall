package Week6;

//6. Create an interface Department containing   attributes deptName and deptHead. It also
//   has abstract methods for printing the attributes. Create a class hostel containing
//   hostelName, hostelLocation and numberofRooms. The class contains methods for
//   getting and printing the attributes.  Then write Student class extending the Hostel class
//   and implementing the Department interface. This class contains attributes studentName,
//   regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods
//   for this class. Also implement the abstract methods of the Department interface. Write a
//   driver class to test the Student class. The program should be menu-driven containing the
//   options:
//   i)Admit new student
//   ii)Migrate a student
//   iii)Display details of a student
//   For the third option a search is to be made on the basis of the entered registration
//   number.

import java.util.Scanner;

interface Department{
    String deptName = "Computer Science and Engineering";
    String deptHead = "Dr. Sukalyan Goswami";
    void printData();
}
class Hostel{
    private String hostelName;
    private String hostelLocation;
    private double numberOfRooms;
    Hostel(String hostelName, String hostelLocation, double numberOfRooms){
        this.hostelLocation = hostelLocation;
        this.hostelName = hostelName;
        this.numberOfRooms = numberOfRooms;
    }
    void showData(){
        System.out.println("Hostel Name : " + hostelName);
        System.out.println("Hostel Location : " + hostelLocation);
        System.out.println("Number of Rooms : " + numberOfRooms);
    }
}
class Student extends Hostel implements Department{
    private String studentName;
    private double regNumber ;
    private String electiveSubjects;
    private double avgMarks;
    Student(String studentName, double regNumber, String electiveSubjects, double avgMarks,String hostelName, String hostelLocation, double numberOfRooms){
        super( hostelName,hostelLocation,numberOfRooms);
        this.avgMarks = avgMarks;
        this.electiveSubjects = electiveSubjects;
        this.studentName = studentName;
        this.regNumber = regNumber;
    }
    double getRegdNo(){
        return regNumber;
    }
    void printDataStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration No: " + regNumber);
        System.out.println("Elective Subject: " + electiveSubjects);
        System.out.println("Average Marks: " + avgMarks);
        showData();

    }
    public void printData(){
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}
public class prog06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];
        int count = 0;

        while (true) {

            System.out.println("\n1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display student details");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter registration number: ");
                    int reg = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter elective subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter average marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter hostel name: ");
                    String hname = sc.nextLine();

                    System.out.print("Enter hostel location: ");
                    String hloc = sc.nextLine();

                    System.out.print("Enter number of rooms: ");
                    int rooms = sc.nextInt();

                    students[count++] =
                            new Student(name, reg, subject, marks, hname, hloc, rooms);

                    break;

                case 2:
                    System.out.println("Student migration completed.");
                    break;

                case 3:

                    System.out.print("Enter registration number to search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].getRegdNo() == search) {
                            students[i].printDataStudent();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");

                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}