package Week4;

//Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and
//        Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and  volume (
//). Override these two methods in each of the derived classes to calculate the volume
//and whole surface area of each type of three-dimensional objects. The dimensions of
//the objects are to be taken from the users and passed through the respective
//constructors of each derived class.  Write a main method to test these classes.

import java.util.Scanner;

import java.util.Scanner;
class ThreeDObject{
    double wholeSurfaceArea(){ return 0; }
    double volume(){ return 0; }
}

class Box extends ThreeDObject{
    double l,b,h;
    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    double wholeSurfaceArea(){return 2*(l*b + b*h + h*l);}
    double volume(){return l*b*h;}
}

class Cube extends ThreeDObject {
    double side;
    Cube(double side) {this.side = side;}

    double wholeSurfaceArea() {return 6 * side * side;}
    double volume() {return side * side * side;}
}

class Cylinder extends ThreeDObject {
    double r, h;
    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {return 2 * Math.PI * r * (r + h);}
    double volume() {return Math.PI * r * r * h;}
}

class Cone extends ThreeDObject {
    double r, h;
    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }
}
public class prog05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box
        System.out.println("Enter length, breadth, height of Box:");
        Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Volume = " + box.volume());
        System.out.println("Box Surface Area = " + box.wholeSurfaceArea());

        // Cube
        System.out.println("\nEnter side of Cube:");
        Cube cube = new Cube(sc.nextDouble());
        System.out.println("Cube Volume = " + cube.volume());
        System.out.println("Cube Surface Area = " + cube.wholeSurfaceArea());

        // Cylinder
        System.out.println("\nEnter radius and height of Cylinder:");
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Volume = " + cylinder.volume());
        System.out.println("Cylinder Surface Area = " + cylinder.wholeSurfaceArea());

        // Cone
        System.out.println("\nEnter radius and height of Cone:");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Volume = " + cone.volume());
        System.out.println("Cone Surface Area = " + cone.wholeSurfaceArea());

        sc.close();
    }
}
