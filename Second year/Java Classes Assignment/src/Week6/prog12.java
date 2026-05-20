package Week6;

class Vehicle1 {

    protected int id;
    protected String name;
    protected String licenseNumber;

    Vehicle1(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    void displayVehicle() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
    }
}

class TwoWheeler extends Vehicle1 {

    private String steeringHandle;

    TwoWheeler(int id, String name, String licenseNumber, String steeringHandle) {
        super(id, name, licenseNumber);
        this.steeringHandle = steeringHandle;
    }

    void display() {
        System.out.println("\n--- Two Wheeler ---");
        displayVehicle();
        System.out.println("Steering Handle: " + steeringHandle);
    }
}

class FourWheeler extends Vehicle1 {

    private String steeringWheel;

    FourWheeler(int id, String name, String licenseNumber, String steeringWheel) {
        super(id, name, licenseNumber);
        this.steeringWheel = steeringWheel;
    }

    void display() {
        System.out.println("\n--- Four Wheeler ---");
        displayVehicle();
        System.out.println("Steering Wheel: " + steeringWheel);
    }
}

public class prog12 {

    public static void main(String[] args) {

        TwoWheeler bike = new TwoWheeler(101, "Bike", "WB12AB1234", "Handle Type A");
        FourWheeler car = new FourWheeler(201, "Car", "WB20CD5678", "Power Steering");

        bike.display();
        car.display();
    }
}