package Week4;
//8. Create a base class Building that stores the number of floors of a building, number of
//        rooms and it’s total footage. Create a derived class House that inherits Building and also
//        stores the number of bedrooms and bathrooms. Demonstrate the working of the classes.

class Building{
    protected int noOfFloors;
    protected int noOfRooms;
    protected double totalFootage;
    Building(int noOfFloors, int noOfRooms, double totalFootage) {
        this.noOfFloors = noOfFloors;
        this.noOfRooms = noOfRooms;
        this.totalFootage = totalFootage;
    }

    void showBuilding() {
        System.out.println("Number of Floors: " + noOfFloors);
        System.out.println("Number of Rooms: " + noOfRooms);
        System.out.println("Total Footage: " + totalFootage);
    }
}
class House extends Building {
    private int noOfBedrooms;
    private int noOfBathrooms;

    House(int noOfFloors, int noOfRooms, double totalFootage,
          int noOfBedrooms, int noOfBathrooms) {

        super(noOfFloors, noOfRooms, totalFootage);
        this.noOfBedrooms = noOfBedrooms;
        this.noOfBathrooms = noOfBathrooms;
    }

    void showHouse() {
        super.showBuilding();
        System.out.println("Number of Bedrooms: " + noOfBedrooms);
        System.out.println("Number of Bathrooms: " + noOfBathrooms);
    }
}

public class prog08 {
    public static void main(String[] args) {
        House house = new House(2, 6, 2500.5, 3, 2);

        System.out.println("---- House Details ----");
        house.showHouse();
    }
}
