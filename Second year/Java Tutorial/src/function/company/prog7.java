package function_methods.com;
import java.util.Scanner;

// Create a class Employee with following properties and methods

class Employee{
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
}

public class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = sc.next();
        System.out.println("Enter the salary of that employee: ");
        int salary = sc.nextInt();

        Employee emp = new Employee();
        emp.salary = salary;
        emp.name = name;

        //Testing
        System.out.println("The name of that employee : "+emp.getName());
        System.out.println("The salary of the employee is : "+emp.getSalary());

        System.out.println("Enter the name to change :");
        String name1 = sc.next();

        emp.setName(name1);
        System.out.println("The name of the employee after change: "+emp.getName());

    }
}
