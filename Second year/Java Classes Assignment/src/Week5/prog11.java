package Week5;

//11. Define a class called circle that contains:
//        • Two private instance variables: radius (of type double) and color (of type String),
//        • Initialize the variables radius and color with default value of 1.0 and "red", respectively
//using default constructor.
//• Include a second constructor that will use the default value for color and sets the
//radius to the value passed as parameter.
//• Two public methods: getRadius() and getArea() for returning the radius and area of
//the circle
//• Invoke the above methods and constructors in the main.

class Circle1{
    private double radius;
    private String color;
    Circle1(){
        radius = 1.0;
        color = "red";
    }
    Circle1(double radius, String color){
        this.color = color;
        this.radius = radius;
    }
    void getRadius(){
        System.out.println("The radius is : " + radius + " with " + color);
    }
    void getArea(){
        System.out.println("The area is : " + (3.14159 * radius * radius)+ " with " + color);
    }
}

public class prog11 {
    public static void main(String[] args) {
        Circle1 cir = new Circle1();
        cir.getRadius();
        cir.getArea();
        Circle1 cir1 = new Circle1(4,"Green");
        cir1.getRadius();
        cir1.getArea();
    }
}
