package JavaCWH;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Random;


public class Lec20_Exercise2_RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        int a = 1, count_u = 0, count_c = 0;
        while (a <= 5) {
            System.out.print("Enter the number: ");
            int userinput = sc.nextInt();

            // userinput=(userinput<0)?0:(userinput>2)?2:userinput;
            // System.out.println(userinput);

            Random r = new Random();
            int compinput = r.nextInt(3);

            if (userinput == compinput) {
                System.out.println("The match is draw.");
            } else if (userinput == 0 && compinput == 2 || userinput == 1 && compinput == 0 ||
                       userinput == 2 && compinput == 1) {
                System.out.println("You won the match!!");
                count_u++;
            } else {
                System.out.println("Computer win the match.");
                count_c++;
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

        if(count_u>count_c){
            System.out.println("Yess!! you won the series by "+(count_u)+"-"+(count_c));
            // PrintWriter printWriter = new PrintWriter(System.out,true);
            // char aa = 'U+1F600';
            // printWriter.println("aa = " + aa);
        }
        else if(count_c>count_u){
            System.out.println("Sorry, computer won the series by "+(count_c)+"-"+(count_u));
        }
        else{
            System.out.println("Series draw by "+(count_u)+"-"+(count_c));
        }

    }
}
