package function_methods.com;
import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor {
    public static void main(String[] args) {
        // First one for userinput;
        Scanner sc = new Scanner(System.in);
        int cont = -1; //Default
        while(cont != 0) {
            System.out.println("Enter your choice (Stone--> 0, paper--> 1, scissor--> 2) : ");
            int userInput = sc.nextInt();

            // Computer generated Input
            Random ch = new Random();
            int systemInput = ch.nextInt(3);
            System.out.println("System Choice: " + systemInput);

            // Same input match draw;
            // user --> stone     0  , system --> scissor  2     1
            // user --> stone     0 , system --> paper     1     0
            // user --> paper     1 , system --> scissor   2     0
            // user --> paper     1 , system --> stone     0     1
            // user --> scissor   2 , system --> paper     1     1
            // user --> scissor   2 , system --> stone     0     0
            if (userInput == systemInput) {
                System.out.println("Match Draw 🙂");
            } else if ((userInput == 0 && systemInput == 2) || (userInput == 1 && systemInput == 0) || (userInput == 2 && systemInput == 1)) {
                System.out.println("You Win !!🥳");
            } else {
                System.out.println("System Win!! 😒");
            }

            System.out.println("Do you want to play again ? [Yes(1) or No(0)]: ");
            cont = sc.nextInt();
        }
        System.out.println("Thanks for playing...");
    }
}
