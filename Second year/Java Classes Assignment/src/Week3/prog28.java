package Week3;

import java.util.Scanner;

//28. Write a class, Commission, which has an instance variable, sales; an appropriate
//constructor; and a method, commission() that returns the commission.
//Now write a demo class to test the Commission class by reading a sale from the user,
//        using it to create a Commission object after validating that the value is not negative.
//Finally, call the commission() method to get and print the commission. If the sales are
//negative, your demo should print the message “Invalid Input”.
class Commission{
    double sales;
    Commission(double sales){
        this.sales = sales;
    }
    double commission(){
        if(sales < 30000){
            return sales * 0.02;
        }
        else if(sales >= 30000 && sales <= 49999){
            return sales * 0.03;
        }
        else if(sales >= 50000 && sales <= 99999){
            return sales * 0.05;
        }
        else if(sales >= 100000){
            return sales * 0.1;
        }
        return 0;
    }
}
public class prog28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales : ");
        double sales = sc.nextDouble();
        Commission com = new Commission(sales);
        System.out.println("The commission of " + sales + " is : " + com.commission());
    }
}
