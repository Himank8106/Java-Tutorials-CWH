package JavaCWH;
import java.util.Scanner;

public class Lec12_Chapter2_PracticeSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // result of following expression
        float a = 7/4*9/2;
        System.out.println(a);
        // 7/4 is integer but 7/4f is float therefore first's answer will be 1 and second's will be 1.75
        float b = 7/4f*9/2f;
        System.out.println(b);
        float c = 7f/4*9f/2;
        System.out.println(c);


        //Encrypt a code by adding 8 to it and also decrypt it to show the correct grade.
        char d = 'B';
        char e = (char)(d+8);
        System.out.println(e);
        char f = (char)(e-8);
        System.out.println(f);

        //Check given number is greater than User's entered number
        System.out.print("Enter user's number: ");
        float g = sc.nextFloat();
        System.out.print("Enter given number for comparison: ");
        float h = sc.nextFloat();
        System.out.println("Hence the statement 'Given number is greater than user's number' is - " + (h>g));

    }
}
