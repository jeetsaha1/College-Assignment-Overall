package Week6;

//9. Create an abstract class MotorVehicle with the following details:
//Data Members:
//        (a) modelName
//        (b)modelNumber
//        (c) modelPrice
//Methods:
//        (a) display() to show all the details

//Create a subclass of this class Carthat inherits the class MotorVehicle and add the
//        following details:
//Data Members:
//        (b) discountRate
//Methods:
//        (a) display() method to display the Car name, model number, price and the discount
//rate.
//        (b) discount() method to compute the discount.


abstract class MotorVehicle{
    protected String modelName;
    protected double modelNumber;
    MotorVehicle(String modelName, double modelNumber){
        this.modelName = modelName;
        this.modelNumber = modelNumber;
    }
    void display(){
        System.out.println("The Model name : " + modelName);
        System.out.println("the Model number : " + modelNumber);
    }
}

class Car1 extends MotorVehicle{
    private double price;
    private double discountRate;
    Car1(String modelName, double modelNumber, double price, double discountRate){
        super(modelName,modelNumber);
        this.discountRate = discountRate;
        this.price = price;
    }
    void display(){
        super.display();
        System.out.println("Price : "  + price);
        System.out.println("Discount rate : " + discountRate);
    }
    void discount(){
        System.out.println("Discount : " + (price*discountRate)/100.0);
    }
}

public class prog09 {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Marati",23817,34000,20);
        car1.display();
        car1.discount();
    }
}
