package JavaCWH;
import java.util.Scanner;

public class Lec16_IfElseConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Yes,you can drive.");
        } else {
            System.out.println("No,you can not drive yet!");
        }

        System.out.print("Enter Marks:");
        int marks = sc.nextInt();
        boolean cond = (marks == 100);
        if (cond) {
            System.out.println("You are the Topper.");
        } else {
            System.out.println("You are not the Topper.");
        }
    }
}
