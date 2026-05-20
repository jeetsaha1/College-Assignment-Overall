package Week6;

//1. Design an abstract class having two methods. Create Rectangle and Triangle classes by
//inheriting the shape class and override the above methods to suitably implement for
//Rectangle and Triangle class.

abstract class Shape{
    abstract void name() ;
    abstract void perimeter() ;
}
class Rectangle extends Shape{
    private double h,w;
    Rectangle(double h, double w){this.h = h; this.w = w;}
    void name(){System.out.println("This is a Rectangle class");}
    void perimeter(){ System.out.println("Area : " + 2*(h+w) );}
}
class Triangle extends Shape{
    private double s1,s2,s3;
    Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    void name(){System.out.println("This is a Triangle class");}
    void perimeter(){ System.out.println("Area : " + (s1 + s2+ s3) );}
}
public class prog01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5.4);
        Triangle triangle = new Triangle(2,4,5);
        rectangle.name();
        rectangle.perimeter();
        triangle.name();
        triangle.perimeter();
    }
}
