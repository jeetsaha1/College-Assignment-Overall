package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;
    public MyMainEmployee(int myid, String myName){
        this.name = myName;
        this.id = myid;
    }
    public MyMainEmployee(int myid, String myName, int salary){
        this.name = myName;
        this.id = myid;
        this.salary = salary;
    }
    public String getName(){ return name; }
    public void setName(String n){ name = n;}
    public void setId(int id1){ id = id1;}
    public void setSalary(int salary){ salary = salary;}
    public int getId(){ return  id;}
    public int getSalary(){ return salary;}

}

public class CWH_Ch9_Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new  MyMainEmployee(23,"Harry",10000);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    }
}
