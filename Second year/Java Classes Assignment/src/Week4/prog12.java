package Week4;
//12. Combine Question number 10 and 11 and have all the three classes together. Now
//describe the working of all classes.
class Num2{
    int num;
    Num2(int num){
        this.num = num;
    }
    void showNum(){
        System.out.println("The number (in integer) :" + num);
    }
}

class HexNum1 extends Num2 {
    HexNum1(int num) {
        super(num);
    }
    @Override
    void showNum() {
        System.out.println("The number (in Hex.): " + Integer.toHexString(num).toUpperCase());
    }
}
class OctNum1 extends Num2 {
    OctNum1(int num) {
        super(num);
    }
    @Override
    void showNum() {
        System.out.println("The number (in Hex.): " + Integer.toOctalString(num).toUpperCase());
    }
}
public class prog12 {
    public static void main(String[] args) {
        Num2 num = new Num2(26);
        HexNum1 hnum = new HexNum1(26);
        OctNum1 onum = new OctNum1(26);
        num.showNum();
        hnum.showNum();
        onum.showNum();
    }
}
