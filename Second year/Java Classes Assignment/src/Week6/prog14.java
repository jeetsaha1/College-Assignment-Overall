package Week6;
//14. Write a program to implement the Multiple Inheritance (Gross Interface, Employee &
//        Salary classes).
interface Gross {

    double calculateGross(double basic);
}

class Employee {

    protected int empId;
    protected String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class Salary extends Employee implements Gross {

    private double basicSalary;

    Salary(int empId, String empName, double basicSalary) {
        super(empId, empName);
        this.basicSalary = basicSalary;
    }

    public double calculateGross(double basic) {

        double hra = basic * 0.20;
        double da = basic * 0.10;

        return basic + hra + da;
    }

    void displaySalary() {

        displayEmployee();

        double gross = calculateGross(basicSalary);

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + gross);
    }
}

public class prog14 {

    public static void main(String[] args) {

        Salary s = new Salary(101, "Jeet Saha", 30000);

        s.displaySalary();
    }
}