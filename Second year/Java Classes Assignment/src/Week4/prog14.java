package Week4;
class Vehicle1 {
    protected int numberOfWheels;
    protected double speed;

    Vehicle1(int numberOfWheels, double speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    void showVehicle() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Speed: " + speed);
    }
}

class Car1 extends Vehicle1 {
    private int numberOfPassengers;

    Car1(int numberOfWheels, double speed, int numberOfPassengers) {
        super(numberOfWheels, speed);
        this.numberOfPassengers = numberOfPassengers;
    }

    void showCar() {
        super.showVehicle();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

class Truck extends Vehicle1 {
    private double loadLimit;

    Truck(int numberOfWheels, double speed, double loadLimit) {
        super(numberOfWheels, speed);
        this.loadLimit = loadLimit;
    }

    void showTruck() {
        super.showVehicle();
        System.out.println("Load Limit: " + loadLimit);
    }
}

public class prog14 {
    public static void main(String[] args) {
        Car1 car = new Car1(4, 120, 5);
        Truck truck = new Truck(6, 90, 10000);

        System.out.println("---- Car Details ----");
        car.showCar();

        System.out.println("\n---- Truck Details ----");
        truck.showTruck();

        System.out.println("\n---- Speed Comparison ----");

        if (car.speed > truck.speed) {
            System.out.println("Car is faster than Truck.");
        } else if (car.speed < truck.speed) {
            System.out.println("Truck is faster than Car.");
        } else {
            System.out.println("Both have same speed.");
        }
    }
}
