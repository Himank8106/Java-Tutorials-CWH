package JavaCWH;
import java.util.Scanner;

public class Lec5_TakingInput {
    public static void main(String[] args) {
        //sout likhne par system.out.println(); likha aa jata hai
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number 2");
        float b = sc.nextFloat();
        sc.nextLine();
        float sum = a+b;
        System.out.println("The sum of this numbers is: ");
        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        sc.nextLine();
        System.out.println(b1);

        // String str = sc.next(); likhne pe sentence ka sirf pehla word hi read out hoga na ki pura sentence
        String str = sc.nextLine();
        System.out.println(str);


    }
}
