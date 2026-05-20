package Week4;
//10. Write a Java program which creates a base class Num and contains an integer number
//        along with a method shownum() which displays the number. Now create a derived class
//HexNum which inherits Num and overrides shownum() which displays the hexadecimal
//value of the number. Demonstrate the working of the classes.
class Num{
    int num;
    Num(int num){
        this.num = num;
    }
    void showNum(){
        System.out.println("The number (in integer) :" + num);
    }
}

class HexNum extends Num {
    HexNum(int num) {
        super(num);
    }
    @Override
    void showNum() {
        System.out.println("The number (in Hex.): " + Integer.toHexString(num).toUpperCase());
    }
}

public class prog10 {
    public static void main(String[] args) {
        Num num = new Num(26);
        HexNum hnum = new HexNum(26);
        num.showNum();
        hnum.showNum();
    }
}
