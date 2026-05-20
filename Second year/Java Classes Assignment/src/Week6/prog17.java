package Week6;
//17. Program to demonstrate use of hierarchical inheritance using interface.
interface Shape1 {
    void area();
}

class Circle implements Shape1 {

    double r = 5;

    public void area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle1 implements Shape1 {

    int l = 4, b = 3;

    public void area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class prog17 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle1 r = new Rectangle1();

        c.area();
        r.area();
    }
}