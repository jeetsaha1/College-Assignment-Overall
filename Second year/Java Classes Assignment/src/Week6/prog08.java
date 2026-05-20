package Week6;

//8. Create an abstract class Accounts  with the following details:
//    Data Members:
//        (a) Balance (b) accountNumber  (c) accountHoldersName   (d) address
//    Methods:
//        (a) withdrawl()- abstract
//        (b) deposit()- abstract
//        (c) display() to show the balance of the account number
//
//
//  Create a subclass of this class SavingsAccount and add the following details:
//     Data Members:
//        (a) rateOfInterest
//     Methods:
//        (a) calculateAount()

abstract class Account{
    protected double balance;
    protected long accountNumber;
    protected String accountHolderName;
    protected String address;

    Account(double balance, long accountNumber, String accountHolderName, String address){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }
    abstract void withdrawn(double amount);
    abstract void deposit(double amount);
    void display(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : " + balance);}
}

class SavingsAccount extends Account{

    private double rateOfInterest;

    SavingsAccount(double balance, long accountNumber, String name, String address, double rateOfInterest){
        super(balance, accountNumber, name, address);
        this.rateOfInterest = rateOfInterest;
    }

    void withdrawn(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful");
    }

    void calculateAmount(){
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Interest added : " + interest);
    }
}

public class prog08 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(
                10000,
                123456,
                "Jeet Saha",
                "Kolkata",
                5.0
        );

        acc.display();

        acc.deposit(2000);
        acc.withdrawn(1500);

        acc.calculateAmount();

        acc.display();
    }
}
