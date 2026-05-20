package Week5;

//15. Write method headers for the following methods:
//a. Computing a sales commission, given the sales amount and the commission rate.
//b. Printing the calendar for a month, given the month and year.
//c. Computing a square root.
//d. Testing whether a number is even, and returning true if it is.
//e. Printing a message a specified number of times.
//f. Computing the monthly payment, given the loan amount, number of years, and
//annual interest rate.

class Headers{
    double computeSalesCommission(double amount, double commissionRate){return amount * (commissionRate / 100);}
    void printCalenders(int year, int month){System.out.println("Calendar for Month: " + month + " Year: " + year);}
    double squareRoot(double number){return Math.sqrt(number);}
    boolean TestEvenOdd(double num){return num%2 ==0 ;}
    void printNumber(int times,String message){
        for(int i = 1; i <= times; i++) {
            System.out.println(message);
        }
    }
    double monthlyPayment(double loanAmount,int years ,double annualRateInterest){
        double monthlyRate = annualRateInterest / 1200;  // convert to monthly
        int numberOfMonths = years * 12;

        double monthlyPayment = (loanAmount * monthlyRate) /
                (1 - Math.pow(1 + monthlyRate, -numberOfMonths));

        return monthlyPayment;
    }
}
public class prog15 {
    public static void main(String[] args) {
        Headers headers = new Headers();
        // (a) Sales Commission
        double commission = headers.computeSalesCommission(50000, 10);
        System.out.println("Sales Commission: " + commission);

        // (c) Square Root
        double sqrt = headers.squareRoot(25);
        System.out.println("Square Root: " + sqrt);

        // (d) Check Even
        boolean even = headers.TestEvenOdd(8);
        System.out.println("Is Even: " + even);

        // (e) Print Message
        headers.printNumber(3,"Hello Baaccho");

        // (f) Monthly Payment
        double payment = headers.monthlyPayment(100000,5,3);
        System.out.println("Monthly Payment: " + payment);

        // (b) Print Calendar (simple version)
        headers.printCalenders(3,2026);
    }
}
