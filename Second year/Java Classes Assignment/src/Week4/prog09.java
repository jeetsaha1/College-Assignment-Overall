package Week4;
//9.In the earlier program, create a second derived class Office that inherits Building and
//        stores the number of telephones and tables. Now demonstrate the working of all three
//classes.

class Office extends Building{
    private int noOfTelephones;
    private int noOfTables;
    Office(int noOfFloors, int noOfRooms, double totalFootage, int noOfTelephones, int noOfTables){
        super(noOfFloors,noOfRooms,totalFootage);
        this.noOfTelephones = noOfTelephones;
        this.noOfTables = noOfTables;
    }
    void showOffice() {
        super.showBuilding();
        System.out.println("Number of Telephones: " + noOfTelephones);
        System.out.println("Number of Tables : " + noOfTables);
    }
}
public class prog09 {
    public static void main(String[] args) {
        Office office = new Office(2, 6, 2500.5, 3, 2);

        System.out.println("---- Office Details ----");
        office.showOffice();
    }
}
