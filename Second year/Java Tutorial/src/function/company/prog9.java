package function_methods.com;
import java.util.Scanner;


// Create a class square with method to initialize its side and calculating area, parameter etc.
class square{
    float side1;
    float side2;
    public float area(){
        return side1 * side2;
    }
    public float perimeter(){
        return (2*(side1 + side2));
    }
}

class circle{
    float rad;
    public float area(){
        return 3.14f * rad * rad;
    }
    public float perimeter(){
        return 2 * 3.14f * rad;
    }
}

public class prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1: ");
        float side1 = sc.nextFloat();
        System.out.println("Enter the side 2: ");
        float side2 = sc.nextFloat();

        square sq = new square();
        sq.side1 = side1;
        sq.side2 = side2;
        System.out.println("The area of the square: "+sq.area());
        System.out.println("The perimeter of the square: "+sq.perimeter());

        // For circle
        System.out.println("Enter the radius: ");
        float rad = sc.nextFloat();
        circle c = new circle();
        c.rad = rad;
        System.out.println("The area of of the circle: "+c.area());
        System.out.println("The perimeter of of the circle: "+c.perimeter());


    }
}
