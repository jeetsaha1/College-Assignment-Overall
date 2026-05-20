package function_methods.com;
import java.util.Scanner;

// Convert the celcuies to Fahrenheit
public class prog6 {

    static float temp_convert(float cel){
        float fer = (cel * 9 / 5)+32;
        return fer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature (in celcuies): ");
        float cel = sc.nextFloat();
        System.out.println("The temp in Fahrenheit: "+temp_convert(cel));
    }
}
