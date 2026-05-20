package Week2;
//Write a Java program to calculate factorial of 12.
public class prog02 {
    static int factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("The Factorial of 12 is : " + factorial(12));
    }
}
