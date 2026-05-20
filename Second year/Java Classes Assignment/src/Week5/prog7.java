package Week5;
//7. Write a program to define a class Fraction having data members numerator and
//        denominator. Initialize three objects using different constructors and display its fractional
//value.
class Fraction{
    public double numerator;
    public double dinominator;
    Fraction(double numerator, double dinominator){
        this.dinominator = dinominator;
        this.numerator = numerator;
        System.out.println("Fraction : " + (numerator/dinominator));
    }

}
public class prog7 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5,2);
        Fraction f2 = new Fraction(6,7);
        Fraction f3 = new Fraction(7,5);
    }
}
