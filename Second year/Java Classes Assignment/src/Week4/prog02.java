package Week4;
//2. Write a Java program to show method overloading.

class Shape{
    void area(double r){
        System.out.println("Area : " + (3.14159 * r * r));
    }
    void area(double h, double w){
        System.out.println("Area : " + (h * w));
    }
}

public class prog02 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(5);
        shape.area(5,3);
    }
}
