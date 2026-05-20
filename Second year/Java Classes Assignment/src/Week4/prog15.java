package Week4;

//15. Write a Java program to explain “multilevel inheritance.”
class P{
    P(){
        System.out.println("This is from class P");
    }
}
class Q{
    Q(){
        super();
        System.out.println("This is from class Q");
    }
}
class R{
    R(){
        super();
        System.out.println("This is from class R");
    }
}
public class prog15 {
    public static void main(String[] args) {
        P p = new P();
       Q q = new Q();
        R r = new R();
    }
}
