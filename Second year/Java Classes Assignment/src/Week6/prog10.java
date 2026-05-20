package Week6;

import java.io.StringReader;
import java.util.Date;

abstract class Asset{
    protected String descriptor;
    protected Date date;
    protected double currentValue;
    Asset(String descriptor, Date date, double currentValue){
        this.currentValue = currentValue;
        this.date = date;
        this.descriptor = descriptor;
    }
    abstract void displayDetails();
}
class Stock extends Asset{
    private double numShares;
    private double sharePrice;
    private String asset;
    Stock(String descriptor, Date date, double currentValue, double numShares, double sharePrice, String asset){
        super(descriptor,date,currentValue);
        this.numShares = numShares;
        this.sharePrice = sharePrice;
        this.asset = asset;
    }
    void displayDetails(){
        System.out.println("____Stock Details____");
        System.out.println("Descriptor : " + descriptor);
        System.out.println("Date : " + date);
        System.out.println("Current Value : " + currentValue);
        System.out.println("Num. Shares : " + numShares);
        System.out.println("Share Price : " + sharePrice);
        System.out.println("Asset : " + asset);
    }
}
class Bond extends Asset{
    private double interestRate;
    private String asset;
    Bond(String descriptor, Date date, double currentValue,double interestRate, String asset){
        super(descriptor,date,currentValue);
        this.interestRate = interestRate;
        this.asset = asset;
    }
    void displayDetails(){
        System.out.println("____Bond Details____");
        System.out.println("Descriptor : " + descriptor);
        System.out.println("Date : " + date);
        System.out.println("Current Value : " + currentValue);
        System.out.println("Interest rate : " + interestRate);
        System.out.println("Asset : " + asset);
    }
}
class Savings extends Asset{
    private double interestRate;
    private String asset;
    Savings(String descriptor, Date date, double currentValue,double interestRate, String asset){
        super(descriptor,date,currentValue);
        this.interestRate = interestRate;
        this.asset = asset;
    }
    void displayDetails(){
        System.out.println("____Savings Details____");
        System.out.println("Descriptor : " + descriptor);
        System.out.println("Date : " + date);
        System.out.println("Current Value : " + currentValue);
        System.out.println("Interest rate : " + interestRate);
        System.out.println("Asset : " + asset);
    }
}
public class prog10 {
    public static void main(String[] args) {
        Date today = new Date();

        Stock stock = new Stock(
                "Tech Stock", today, 50000,
                100, 500, "Equity");

        Bond bond = new Bond(
                "Government Bond", today, 20000,
                5.5, "Debt");

        Savings savings = new Savings(
                "Savings Account", today, 15000,
                4.0, "Bank Deposit");

        stock.displayDetails();
        bond.displayDetails();
        savings.displayDetails();    }
}
