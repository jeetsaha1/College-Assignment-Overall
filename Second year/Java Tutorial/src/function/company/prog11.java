package function_methods.com;

class cylinders{
    private int radius;
    private int height;
    public cylinders(int rad, int h){
        this.height = h;
        this.radius = rad;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float surface(){
        return (float) ((2 * 3.14 * radius * height)+ (2 * 3.14 * radius * radius));
    }
    public float volume(){
        return (float)(3.14 * radius * radius * height);
    }
}

public class prog11 {
    public static void main(String[] args) {
        cylinders c1 = new cylinders(5,10);
        c1.setRadius(5);
        c1.setHeight(10);
        System.out.println("The radius of the cylinder: "+c1.getRadius());
        System.out.println("The height of the cylinder: "+c1.getHeight());
        System.out.println("The surface of the cylinder: "+c1.surface());
        System.out.println("The volume of the cylinder: "+c1.volume());
    }
}
