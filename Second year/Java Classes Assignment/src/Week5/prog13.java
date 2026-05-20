package Week5;

//13. Design a class named Account that contains:
//I.        A private int data field named id for the account (default 0).
//II.       A private double data field named balance for the account (default 0).
//III.      A private double data field named annualInterestRate that stores the cur-rent
//                  interest rate (default 0). Assume all accounts have the same interest rate.
//IV.       A private Date data field named dateCreated that stores the date when the
//                  account was created.
//V.        A no-arg constructor that creates a default account.
//VI.       A constructor that creates an account with the specified id and initial balance.
//VII.      The accessor and mutator methods for id,balance, and annualInterestRate.
//VIII.     The accessor method for dateCreated.
//IX.       A method named getMonthlyInterestRate() that returns the monthly interest rate.
//X.        A method named getMonthlyInterest() that returns the monthly interest.
//XI.       A method named withdraw that withdraws a specified amount from the account.
//XII.      A method named deposit that deposits a specified amount to the account.
import java.util.Date;
class Account{
    private int accId ;
    private double accBalance ;
    private static double annualInterestRate ;
    private Date date;

    Account(){
        int accId = 0;
        double accBalance = 0;
        double annualInterestRate = 0;
        date = new Date();
    }
    Account(int accId, double accBalance){
        this.accBalance = accBalance;
        this.accId = accId;
        date = new Date();
    }
    public int getAccId(){return accId;}
    public double getBalance() {return accBalance;}
    public static double getAnnualInterestRate() {return annualInterestRate;}
    public Date getDateCreated() {return date;}

    public void setId(int accid) {this.accId = accId;}
    public void setBalance(double accbalance) {this.accBalance = accbalance;}
    public static void setAnnualInterestRate(double rate) {annualInterestRate = rate;}

    public double getMonthlyInterestRate(){return annualInterestRate/12;}
    public double getMonthlyInterest(){return accBalance * (getMonthlyInterestRate()/100);}
    public void withdraw(double amount){accBalance -= amount;}
    public void deposit(double amount){ accBalance += amount;}
}

public class prog13 {
    public static void main(String[] args) {
        Account acc = new Account(101, 10000);

        Account.setAnnualInterestRate(12);   // 12%

        acc.withdraw(2000);
        acc.deposit(500);

        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Date Created: " + acc.getDateCreated());
    }
}
