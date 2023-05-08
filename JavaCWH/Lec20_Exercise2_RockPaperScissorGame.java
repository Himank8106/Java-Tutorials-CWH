package JavaCWH;
import java.util.Scanner;
import java.util.Random;


public class Lec20_Exercise2_RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        int a = 1;
        while (a <= 5) {
            System.out.print("Enter the number: ");
            int userinput = sc.nextInt();

            Random r = new Random();
            int compinput = r.nextInt(3);

            if (userinput == compinput) {
                System.out.println("The match is draw.");
            } else if (userinput == 0 && compinput == 2 || userinput == 1 && compinput == 0 ||
                       userinput == 2 && compinput == 1) {
                System.out.println("You won the match!!");
            } else {
                System.out.println("Computer win the match.");
            }

            if (compinput == 0) {
                System.out.println("Computer's input was: Rock");
            } else if (compinput == 1) {
                System.out.println("Computer's input was: Paper");
            } else if (compinput == 2) {
                System.out.println("Computer's input was: Scissors");
            }
            a++;
        }

    }
}
