package Week3;
//25. Write a Java program to show parameterized constructor.
class Classname1{
    Classname1(int a){
        System.out.println("Parametrised Constructor is called with a value : " + a);
    }
}
public class prog25 {
    public static void main(String[] args) {
        Classname1 class1 = new Classname1(5);
    }
}
