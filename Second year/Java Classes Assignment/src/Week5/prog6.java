package Week5;

//Write a program to define a class Employee to accept emp_id, emp _name, basic_salary
//        from the user and display the gross_salary.

class Employee{
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    Employee(int emp_id, String emp_name,double basic_salary ){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }
    void grossSalary(){
        System.out.println("_____Details_____\n" +
                " Name : " + emp_name + "\n" +
                " Employee id : " + emp_id + "\n" +
                " Salary :" + basic_salary);
    }
}

public class prog6 {
    public static void main(String[] args) {
        Employee employee = new Employee(123,"Jeet Saha",12300);
        employee.grossSalary();
    }
}
