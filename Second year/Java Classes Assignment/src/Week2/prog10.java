package Week2;
//Write a Java program to find HCF of two Numbers.
public class prog10 {
    static int HCF(int a, int b){
        while(b !=  0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(HCF(18, 20));
    }
}
