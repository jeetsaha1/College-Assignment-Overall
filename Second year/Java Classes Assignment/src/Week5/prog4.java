package Week5;
//4. Write a program to define a class having one 3-digit number, num as data member.
//Initialize and display reverse of that number.
class Number{
    public int num;
    Number(int num){
        this.num = num;
    }
    void reverse(){
        int r,sum = 0;
        while (num > 0){
            r = num %10;
            sum = (sum*10) + r;
            num /= 10;
        }
        System.out.println(sum);
    }
}
public class prog4 {
    public static void main(String[] args) {
        Number num = new Number(123);
        num.reverse();
    }
}
