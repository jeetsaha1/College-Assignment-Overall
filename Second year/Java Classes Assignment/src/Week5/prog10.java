package Week5;

//10. Write a program to define a class 'employee' with data members as empid, name and
//salary. Accept data for 5 objects using Array of objects and print it.



import java.util.Scanner;

class Employee1 {

    int empid;
    String name;
    double salary;

    void getData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }
}

public class prog10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee1 emp[] = new Employee1[5];

        for (int i = 0; i < 5; i++) {
            emp[i] = new Employee1();
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i].getData(sc);
        }

        System.out.println("\nEmployee Details:");

        for (int i = 0; i < 5; i++) {
            emp[i].display();
        }

        sc.close();
    }
}