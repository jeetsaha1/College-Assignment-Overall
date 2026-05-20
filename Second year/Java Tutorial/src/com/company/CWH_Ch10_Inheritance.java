package com.company;

class Base{
    int x;
    public void printMe(){
        System.out.println("I am a constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends Base{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class CWH_Ch10_Inheritance {
    public static void main(String[] args) {

    }
}
