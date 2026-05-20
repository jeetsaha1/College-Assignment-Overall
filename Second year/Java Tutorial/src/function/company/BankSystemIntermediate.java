package function.company;

import java.util.ArrayList;
import java.util.Random;

/*
1️⃣ Role-Based Banking System (Intermediate+)
Why advanced: OOP + role separation + validation
Problem Statement
Two roles: Admin and Customer

Admin can: Create accounts, Freeze / activate accounts
Customer can: Deposit / withdraw, View balance
Account number is random & unique
Transactions are logged
Concepts Used : OOP, Encapsulation, Role-based logic, Collections
 */
enum AccountState {
    ACTIVE,
    FROZEN
}

class AccountDetails {
    String HolderName;
    long AccountNo;
    AccountState State;
    double Balance;

    AccountDetails(String holderName, long accountNo, AccountState state, double balance) {
        HolderName = holderName;
        AccountNo = accountNo;
        State = state;
        Balance = balance;
    }
}


class BankSystemDetails{
    ArrayList<AccountDetails> database1 = new ArrayList<>();
    Random rn = new Random();
    void createAccount(String name, AccountState type, double balance){
        Random rn = new Random();
        long min = 1_000_000_000L;   // smallest 10-digit number
        long max = 9_999_999_999L;   // largest 10-digit number

        long accNumber = generateUniqueAccountNumber();

        database1.add(new AccountDetails(name, accNumber, type, balance));
        System.out.println("The Account is created. Account no. --> " + accNumber);
    }

    void DepositMoney(long acc, double balance, String name) {
        boolean found = false;
        for (AccountDetails cust : database1){
            if(cust.AccountNo == acc && cust.HolderName.equalsIgnoreCase(name)){
                if(cust.State == AccountState.ACTIVE){
                    found = true;
                    cust.Balance += balance;
                    System.out.println("Your Transaction is successful");
                    System.out.println("Thank You");
                    logTransaction(acc, "DEPOSIT", balance);

                    return;
                }
                else{
                    System.out.println("Transaction is rejected");
                }
            }
        }
        if(!found)
            System.out.println("Account Not found");
    }
    class Transaction {
        long accountNo;
        String type;
        double amount;

        Transaction(long accountNo, String type, double amount) {
            this.accountNo = accountNo;
            this.type = type;
            this.amount = amount;
        }
    }
    ArrayList<Transaction> transactions = new ArrayList<>();

    private void logTransaction(long acc, String type, double amount) {
        transactions.add(new Transaction(acc, type, amount));
    }

    void Freeze(long accNumber){
        for (AccountDetails cust : database1){
            if(accNumber == cust.AccountNo){
                cust.State = AccountState.FROZEN;
                break;
            }
        }
        System.out.println("The Account no. " + accNumber + " is frozen");
    }
    private boolean accountExists(long accNo) {
        for (AccountDetails acc : database1) {
            if (acc.AccountNo == accNo) {
                return true;
            }
        }
        return false;
    }
    private long generateUniqueAccountNumber() {
        long min = 1_000_000_000L;
        long max = 9_999_999_999L;
        long accNo;

        do {
            accNo = min + (long)(rn.nextDouble() * (max - min + 1));
        } while (accountExists(accNo));

        return accNo;
    }
    void withdrawMoney(long acc, double amount, String name) {
        boolean found = false;

        for (AccountDetails cust : database1) {
            if (cust.AccountNo == acc && cust.HolderName.equalsIgnoreCase(name)) {
                found = true;

                if (cust.State != AccountState.ACTIVE) {
                    System.out.println("Account is frozen. Withdrawal rejected.");
                    return;
                }

                if (cust.Balance < amount) {
                    System.out.println("Insufficient balance.");
                    return;
                }

                cust.Balance -= amount;
                logTransaction(acc, "WITHDRAW", amount);
                System.out.println("Withdrawal successful.");
                return;
            }
        }

        if (!found)
            System.out.println("Account not found.");
    }


}

class Admin{
    private BankSystemDetails system;

    Admin(BankSystemDetails system) {
        this.system = system;
    }

    void createNewAccount_ad(String name, AccountState type, double balance){
        system.createAccount(name,  type,  balance);
    }

    void freezeCorruptedAccount(long number){
        system.Freeze(number);
    }
}

class Customer {
    private BankSystemDetails system;
    private long accNo;
    private String name;

    Customer(BankSystemDetails system, long accNo, String name) {
        this.system = system;
        this.accNo = accNo;
        this.name = name;
    }

    void deposit(double amount) {
        system.DepositMoney(accNo, amount, name);
    }

//    void withdraw(double amount) {
//        system.withdrawMoney(accNo, amount, name);
//    }
}


public class BankSystemIntermediate {
    public static void main(String[] args) {
        BankSystemDetails system = new BankSystemDetails();
        String name = "Jeet";
        AccountState type = AccountState.ACTIVE;
        double balance = 20000;
        long accno = 1234567890L;
        Admin admin = new Admin(system);
        Customer customer = new Customer(system, 1234567890L,name);

        admin.createNewAccount_ad(name, type, balance);       // ✅ allowed
        customer.deposit(balance);
    }
}
