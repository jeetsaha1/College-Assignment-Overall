package Week5;

//14. Write a test program that prompts the user to enter the investment amount (e.g., 1000)
//and the interest rate (e.g., 9%), and print a table that displays future value for the years
//from 1 to 30, as shown below:
//The amount invested: 1000
//Annual interest rate: 9%
//Years       Future Value
//  1          1093.8
//          2          1196.41
//          ...
//          29         13467.25
//          30         14730.57

class InvestmentDetector{
    private double amount;
    private double rate;
    InvestmentDetector(double amount, double rate){
        this.amount = amount;
        this.rate = rate;
    }
    void showTable(){
        System.out.println("Years " +"\t\t" + "Future Value");
        for (int i = 1; i <= 30; i++) {
            System.out.println(i+"\t\t" +amount * Math.pow(1 + rate/100, i) );
        }
    }
}
public class prog14 {
    public static void main(String[] args) {
        InvestmentDetector inv = new InvestmentDetector(1000,9);
        inv.showTable();
    }
}
