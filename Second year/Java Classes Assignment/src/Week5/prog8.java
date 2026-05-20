package Week5;

import java.util.Scanner;

//8. Write a program to define a class Item containing code and price. Accept this data for
//five objects using array of objects. Display code, price in tabular form and also, display
//total price of all items.
class Item{
    private int code;
    private double price;
    Item(int code, double price){
        this.code = code;
        this.price = price;
    }
    void display() {
        System.out.println(code + "\t\t" + price);
    }
    double getprice(){
        return price;
    }
}
public class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter code and price for item " + (i + 1) + ": ");
            int code = sc.nextInt();
            double price = sc.nextDouble();

            items[i] = new Item(code, price);
        }

        // Display in tabular form
        double total = 0;
        System.out.println("\nCode\t\tPrice");
        System.out.println("-----------------------");
        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].getprice();
        }
        System.out.println("The Total price : " + total) ;

    }
}
