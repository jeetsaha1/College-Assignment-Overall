package Week4;
//11. Write a Java program which creates a base class Num and contains an integer number
//        along with a method shownum() which displays the number. Now create a derived class
//OctNum which inherits Num and overrides shownum() which displays the octal value of
//the number. Demonstrate the working of the classes.
class Num1{
    int num;
    Num1(int num){
        this.num = num;
    }
    void showNum(){
        System.out.println("The number (in integer) :" + num);
    }
}
class OctNum extends Num {
    OctNum(int num) {
        super(num);
    }
    @Override
    void showNum() {
        System.out.println("The number (in Hex.): " + Integer.toOctalString(num).toUpperCase());
    }
}

public class prog11 {
    public static void main(String[] args) {
        Num1 num = new Num1(26);
        OctNum onum = new OctNum(26);
        num.showNum();
        onum.showNum();
    }
}
