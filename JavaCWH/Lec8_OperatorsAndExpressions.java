package JavaCWH;
import java.util.Scanner;

public class Lec8_OperatorsAndExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Arithmetic Operators
        int a = 5;
        int b = a%4;  //Modulo operator (Gives you remainder... 1 in this case)
//        4.8%1.1 --> 0.4  modulo operator works in float and double which can also gives answer in decimals.
        System.out.println(b);


//        Assignment Operators
        int c = 5;
        c += 6;
        System.out.println(c);

        System.out.print("Enter the number:- ");
        int e = sc.nextInt();
        e *= 5;
        System.out.println(e);


//        Comparison Operators (Basically gives result in true or false)
//                 (= means equal but == used to compare)
        System.out.println(64<6);
        System.out.println(8==8);
        System.out.println(50>=40);


//        Logical Operators (&&,||,!)
        System.out.println(45>5 && 54<55);
        System.out.println(5>6 && 6>5);
        System.out.println(5>6 || 6>5);
        System.out.println(!true);
        System.out.println(!(true && false));


//        Bitwise Operators (& and |)
//        decimal numbers ko binary me convert karke 'and' ya 'or' operation karte hai
        System.out.println(5&6);    // 101 * 110 = 1*1 0*1 1*0 = 100 = 4
        System.out.println(48|22);  // returns 54

        sc.close();
    }
}
