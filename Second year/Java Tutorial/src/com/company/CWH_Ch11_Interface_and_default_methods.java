package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k .. ");
    };
}

interface MyWifi{
    String[] getNetworks();
    void ConnectionToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling..."+phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements MyCamera, MyWifi{
    public void takeSnap(){
        System.out.println("Taking snap");
    }

    public void recordVideo(){
        System.out.println("Recording video");
    }
    public void record4kVideo(){
        System.out.println("Recording 4k video");
    }

    public String[] getNetworks(){
        System.out.println("Getting list of numbers: ");
        String[] networkList = {"Jeet","Avirupa","Arya"};
        return networkList;
    }

    public void ConnectionToNetwork(String network){
        System.out.println("Connecting to" + network);
    }

}

public class CWH_Ch11_Interface_and_default_methods {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        String[] ar = sm.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
