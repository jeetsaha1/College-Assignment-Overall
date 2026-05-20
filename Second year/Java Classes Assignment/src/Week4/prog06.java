package Week4;
//6. Write a program to create a class named Vehicle having protected instance variables
//regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
//vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
//        individual private instance variables routeNumber in Bus and manufacturerName in Car
//and both of them having showData ( ) method showing all details of Bus and Car
//respectively with content of the super class’s showData ( ) method.

class Vehicle{
    protected double regNumber;
    protected double speed;
    protected String color;
    protected String ownerName;
    Vehicle(double regNumber,double speed, String color, String ownerName){
        this.regNumber = regNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    void showData(){
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle{
    private int routeNumber;
    Bus(double regNumber,double speed, String color, String ownerName,int routeNumber){
        super(regNumber,speed,color,ownerName);
        this.routeNumber = routeNumber;
    }
    void showData(){
         super.showData();
         System.out.println("Reg. Number : " + regNumber);
         System.out.println("Speed : " + speed) ;
         System.out.println("Color : " + color);
         System.out.println("Owner Name : " + ownerName);
         System.out.println("Route Number : " + routeNumber);
    }
}

class Car extends Vehicle{
    private String manufactureName;

    Car(double regNumber, double speed, String color, String ownerName, String manufacturerName) {
        super(regNumber, speed, color, ownerName);
        this.manufactureName = manufacturerName;
    }
    void showData() {
        super.showData();
        System.out.println("Reg. Number : " + regNumber);
        System.out.println("Speed : " + speed);
        System.out.println("Color : " + color);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Manufacturer Name : " + manufactureName);
    }
}

public class prog06 {
    public static void main(String[] args) {
        Bus bus = new Bus(12345, 60, "Red", "Rahul", 101);
        Car car = new Car(54321, 80, "Black", "Amit", "Toyota");

        System.out.println("---- Bus Details ----");
        bus.showData();

        System.out.println("\n---- Car Details ----");
        car.showData();
    }
}
