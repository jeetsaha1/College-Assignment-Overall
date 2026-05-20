package com.company;

class Employee{
    private int id1;
    private String name1;

    public void getName(String name){
        name1 = name;
    }
    public void getid(int id){
        id1 = id;
    }
    public void printDetails(){
        System.out.println("My id is: "+ id1);
        System.out.println("My name is : "+name1);
    }
}

public class CWH_Ch8_OOPS {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();    //Instantiating a new object
        // Settings Attributes
//        harry.id = 12;
//        harry.name = "Harry";


        //Printing the properties
//        System.out.println(harry.id);
//        System.out.println(harry.name);

//        harry.printDetails();

        harry.getid(12);
        harry.getName("Harry");
        harry.printDetails();





    }
}
