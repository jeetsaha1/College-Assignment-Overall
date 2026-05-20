package Week6;

//3.Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and
//        Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and  volume(
//). Override these two methods in each of the derived classes to calculate the volume
//and whole surface area of each type of three-dimensional objects. The dimensions of
//the objects are to be taken from the users and passed through the respective
//constructors of each derived class.  Write a main method to test these classes.

abstract class ThreeDObject{
    abstract void wholeSurfaceArea();
    abstract void volume();
}
class Box extends ThreeDObject{
    private double length, height, width;
    Box(double length, double height, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }
    void wholeSurfaceArea(){System.out.println("Area : " + 2*((height*width) + (width*length) + (length*height)));}
    void volume(){System.out.println("Volume : " + (height * length* width));}
}
class Cube extends ThreeDObject{
    private double side;
    Cube(double side){
        this.side = side;
    }
    void wholeSurfaceArea(){System.out.println("Area : " +( 6 * side * side));}
    void volume(){System.out.println("Volume : " + (side * side * side));}
}
class Cylinder extends ThreeDObject{
    private double radius, height;
    Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }
    void wholeSurfaceArea(){System.out.println("Area : " +(2 * Math.PI * radius * height));}
    void volume(){System.out.println("Volume : " + (Math.PI * radius * radius * height));}
}
class Cone extends ThreeDObject{
    private double radius, height,l;
    Cone(double radius, double height,double l){
        this.height = height;
        this.radius = radius;
        this.l = l;
    }
    void wholeSurfaceArea(){System.out.println("Area : " +( Math.PI * radius *(radius + l) ));}
    void volume(){System.out.println("Volume : " + (Math.PI * radius * radius * height)/3);}
}

public class prog03 {
    public static void main(String[] args) {
        Box b = new Box(5, 3, 2);
        Cube c = new Cube(4);
        Cylinder cy = new Cylinder(3, 5);
        Cone co = new Cone(3, 5, 6);
        System.out.println("____BOX____");
        b.wholeSurfaceArea();
        b.volume();
        System.out.println("____CUBE____");
        c.wholeSurfaceArea();
        c.volume();
        System.out.println("____Cylinder____");
        cy.wholeSurfaceArea();
        cy.volume();
        System.out.println("____Cone____");
        co.wholeSurfaceArea();
        co.volume();
    }
}
