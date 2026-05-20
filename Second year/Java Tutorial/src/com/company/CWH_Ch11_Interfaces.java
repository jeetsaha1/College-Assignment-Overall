package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }
}

public class CWH_Ch11_Interfaces {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        a.applyBrake(1);

    }
}
