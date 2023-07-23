package JavaCWH;
import java.util.Scanner;

public class Lec18_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String a = sc.nextLine();
        switch (a){
            case "Himank":
                System.out.println("Hi Men!!");
                break;
            case "Lakshya":
                System.out.println("Hi Buddy!!");
                break;
            case "Jiyansh":
                System.out.println("Hi Champ!!");
                break;
            default:
                System.out.println("Hi,have a good day.");
            //Not necessary to write default
        }



        System.out.print("Enter number: ");
        int b = sc.nextInt();
        //above layout is old switch statement layout and this is enhanced switch statement layout
        switch (b) {
            case 111 -> System.out.println("Good Morning!!");
            case 222 -> System.out.println("Good Afternoon!!");
            case 333 -> System.out.println("Good Night!!");
            default -> System.out.println("Have a nice day.");
        }





        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if(age>60){
            System.out.println("You are retired.");
        }
        else if (age>45){
            System.out.println("You are old.");
        }
        else if (age>30) {
            System.out.println("You are young.");
        }
        else {
            System.out.println("You are a child.");
        }
    }
}
