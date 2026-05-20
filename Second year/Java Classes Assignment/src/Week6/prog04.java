package Week6;

//4. Write a program to create a class named Vehicle having protected instance variables
//regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
//vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
//individual private instance variables routeNumber in Bus and manufacturerName in Car
//and both of them having showData ( ) method showing all details of Bus and Car
//respectively with content of the super class’s showData ( ) method.

class Vehicle{
    protected double regNumber;
    protected double speed;
    protected String color;
    protected String ownerName;
    Vehicle(double regNumber, double speed, String color, String ownerName){
        this.regNumber = regNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    void showData(){System.out.println("This is a vehicle class.");}
}

class Bus extends Vehicle{
    private double routeNumber;
    Bus(double regNumber, double speed, String color, String ownerName, double routeNumber){
        super(regNumber,speed,color,ownerName);
        this.routeNumber = routeNumber;
    }
    void showData(){
        super.showData();
        System.out.println("____BUS____");
        System.out.println("Reg Number : " + regNumber);
        System.out.println("Speed : " + speed);
        System.out.println("Color : " + color);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Route Number : " + routeNumber);
    }
}

class Car extends Vehicle{
    private String manufactureName;
    Car(double regNumber, double speed, String color, String ownerName,String manufactureName){
        super(regNumber,speed,color,ownerName);
        this.manufactureName = manufactureName;
    }
    void showData(){
        super.showData();
        System.out.println("____CAR____");
        System.out.println("Reg Number : " + regNumber);
        System.out.println("Speed : " + speed);
        System.out.println("Color : " + color);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Manufacture Name : " + manufactureName);
    }
}

public class prog04 {
    public static void main(String[] args) {
        Bus bus = new Bus(2312,145,"Red","Rahul Sharma",238);
        Car car =  new Car(4567,200,"Green","Jeet Saha","TATA");
        bus.showData();
        car.showData();
    }
}
