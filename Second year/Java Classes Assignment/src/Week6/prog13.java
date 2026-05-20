package Week6;
//13. Write a program to implement the Multiple Inheritance (Bank Interface, Customer &
//        Account classes).

interface Bank {

    void deposit(double amount);
    void withdraw(double amount);
}

class Customer {

    protected String customerName;
    protected int customerId;

    Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account1 extends Customer implements Bank {

    private double balance;

    Account1(String name, int id, double balance) {
        super(name, id);
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {
        displayCustomer();
        System.out.println("Current Balance: " + balance);
    }
}

public class prog13 {

    public static void main(String[] args) {

        Account1 acc = new Account1("Jeet Saha", 101, 5000);

        acc.displayAccount();

        acc.deposit(2000);
        acc.withdraw(1500);

        acc.displayAccount();
    }
}