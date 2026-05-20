package Week3;
//26. Write a Java program to show constructor overloading.
class ClassName{
    ClassName(){
        System.out.println("This is constructor 1");
    }
    ClassName(int a){
        System.out.println("This is constructor 2 with taking value : " + a);
    }
}
public class prog26 {
    public static void main(String[] args) {
        ClassName class1 = new ClassName();
        ClassName class2 = new ClassName(2);
    }
}
