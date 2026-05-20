package Week6;
//18. Java program to Perform Payroll Using Interface (Multiple Inheritance).
interface Payable {
    double calculatePay();
}

class Employee1 {
    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Payroll extends Employee1 implements Payable {

    double basic;

    Payroll(int id, String name, double basic) {
        super(id, name);
        this.basic = basic;
    }

    public double calculatePay() {

        double hra = basic * 0.20;
        double da = basic * 0.10;

        return basic + hra + da;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gross Pay: " + calculatePay());
    }
}

public class prog18 {
    public static void main(String[] args) {

        Payroll p = new Payroll(201, "Jeet", 30000);
        p.display();
    }
}