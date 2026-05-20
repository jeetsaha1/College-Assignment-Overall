package Week5;

//9. Write a program to define a class Tender containing data members cost and company
//        name. Accept data for five objects and display company name for which cost is
//minimum.

import java.util.Scanner;

class Tender{
    private double cost;
    private String comName;
    Tender(double cost, String comName){
        this.comName = comName;
        this.cost = cost;
    }
    void display(){
        System.out.println(comName + "\t\t" + cost);
    }
    double getCost(){
        return cost;
    }
}
public class prog09 {
    public static void main(String[] args) {
        Tender[] tender = new Tender[5];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter company and cost for item " + (i + 1) + ": ");
            String comName = sc.next();
            double cost = sc.nextDouble();

            tender[i] = new Tender(cost, comName);
        }
        double min = tender[0].getCost();
        for (int i = 0; i < 5; i++) {
            tender[i].display();
            if(min > tender[i].getCost()){
                min = tender[i].getCost();
            }
        }
        System.out.println("Minimum : " + min);
    }
}
