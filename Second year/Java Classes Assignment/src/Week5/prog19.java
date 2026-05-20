package Week5;
//19. Write a program to demonstrate use of 'static' keyword.
class B{
    static void show(){
        System.out.println("This is printed from class B");
    }
}
public class prog19 {
    public static void main(String[] args) {
        B.show();
    }
}
