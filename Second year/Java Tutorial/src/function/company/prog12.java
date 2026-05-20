package function_methods.com;
import java.util.Scanner;
class Circle1{
    private float rad;

    public void setRad(float rad) {this.rad = rad;}
    public void getRad(){
        System.out.println("The radius is : "+rad);
    }
    public float area(){
        return (float) (3.14 * rad * rad);
    }

    public float perimeter(){
        return (float) (3.14 * rad *2);
    }
}

class Cylinder1 extends Circle1{
    private float height;

    public void setHeight(float height) {this.height = height;}

    public void getHeight() {
        System.out.println("The height of the cylinder : "+height);
    }

    public float Surface(){
        float c_area = area();
        float c_peri = perimeter();
        return (c_peri*height) + (2 * c_area);
    }

    public float Volume (){
        float c_area = area();
        return (float) (c_area * height);
    }
}

public class prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the cylinder: ");
        float height = sc.nextFloat();
        System.out.println("Enter the radius of the cylinder: ");
        float radius = sc.nextFloat();

        Cylinder1 c1 = new Cylinder1();
        c1.setHeight(height);
        c1.setRad(radius);

        c1.getRad();
        c1.getHeight();
        System.out.println("The Surface area of the cylinder: " + c1.Surface());
        System.out.println("The Surface volume of the cylinder: " + c1.Volume());
    }
}
