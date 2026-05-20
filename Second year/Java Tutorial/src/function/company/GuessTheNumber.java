package function_methods.com;
import java.util.Scanner;
import java.util.Random;
/*
Create a class Game, which allows a user to play "Guess the Number"
Game once, Game should have the following methods
1. Constructor to generate the random number
2. takeUserInput() to take user input of number
3. isCorrectNumber () to detect whether the number is entered by the user is true or not
4. getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
*/

class Game{
    int number;
    int userInput;
    int noOfGuess;

    public Game(){
        Random ch = new Random();
        number = ch.nextInt(10);
        noOfGuess = 0;
    };

    public void takeUserInput(int input){
        userInput = input;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public boolean isCorrectNumber(){
        noOfGuess++;
        if (userInput == number) {
            System.out.println("Correct Number");
            System.out.println("You guessed it within "+noOfGuess+" attempts.");
            return true;
        }
        else if(userInput > number){
            System.out.println("It is Higher than of that number");
        }
        else{
            System.out.println("It is Lower than of that number");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);

        boolean gameOver = false;
        while(!gameOver){
            System.out.println("Enter the number: ");
            int input = sc.nextInt();
            g.takeUserInput(input);
            gameOver = g.isCorrectNumber();
        }
    }
}
