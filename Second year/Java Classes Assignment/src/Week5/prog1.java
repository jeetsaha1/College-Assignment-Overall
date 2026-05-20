package Week5;
import java.util.Scanner;

//1. Create a “circle” class & a “point” class. The coordinates of the circle are given and used
//within the “circle” class as object of the “point” class. Display the area of circle.

class Pointer{
    public double x;
    public double y;
    Pointer(){};
    Pointer(double x, double y){
        this.x = x;
        this.y = y;
    }
}
class Circle{
    Pointer c;
    Pointer p1;
    Circle(double x1, double y1, double x2, double y2){
        c = new Pointer(x1,y1);
        p1 = new Pointer(x2,y2);
    }
    void area(){
        double rSq = Math.pow((c.x-p1.x),2) + Math.pow((c.y- p1.y),2);
        double a = 3.14159 * rSq;
        System.out.println("The area is : " + a);
    }
}

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate, y-coordinate (first) : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter the x-coordinate, y-coordinate (second) : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Circle cir = new Circle(x1,y1,x2,y2);
        cir.area();
    }
}
