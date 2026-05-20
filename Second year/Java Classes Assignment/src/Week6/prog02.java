package Week6;
//2. Write a program in Java to illustrate the use of interface in Java.
interface Phone{
    public void name();
    public void camera();
    public void battery();
}
class Samsung implements Phone{
    public void name(){System.out.println("This is a phone --> Samsung S24 ULTRA");}
    public void camera(){System.out.println(" 100 mega pixel");}
    public  void battery(){System.out.println("8800 mAh battery");}
}
class iPhone implements Phone{
    public void name(){System.out.println("This is a phone --> iPhone 17 Pro MAX");}
    public void camera(){System.out.println(" 80 mega pixel");}
    public  void battery(){System.out.println("6600 mAh battery");}
}
public class prog02 {
    public static void main(String[] args) {
        System.out.println("____SAMSUNG____");
        Samsung samsung = new Samsung();
        samsung.name();samsung.camera();samsung.battery();

        System.out.println("____IPhone____");
        iPhone iphone = new iPhone();
        iphone.name();iphone.camera();iphone.battery();
    }
}
