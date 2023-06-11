package JavaCWH;
import java.util.Random;
import java.util.Scanner;

class Game {
    int number;
    int inputNumber;
    int noOfGuesses = 0;

    Game() {
        Random r = new Random();
        number = r.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.printf("Yes,you guessed it right in %d attempts.",noOfGuesses);
            return true;
        }
        else if (inputNumber>number) {
            System.out.println("Too high...");
        }
        else {
            System.out.println("Too low...");
        }
        return false;
    }
}

public class Lec43_Exercise3_GuessTheNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}

