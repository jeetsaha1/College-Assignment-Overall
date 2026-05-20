package Week5;
//18. Write a program to demonstrate use of 'this' keyword.
class A{
    int data;
    A(int data){
        this.data = data;
        System.out.println("The Number is : " + data);
    }
}
public class prog18 {
    public static void main(String[] args) {
        A a = new A(3);
    }
}
