package Week2;
//Write a Java program to generate all combination of 1, 2, or 3 using loop.
public class prog19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                for (int k = 1; k <= 3; k++)
                    System.out.println(i + " " + j + " " + k);
    }
}
