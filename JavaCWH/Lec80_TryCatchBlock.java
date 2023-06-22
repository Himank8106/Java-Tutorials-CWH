package JavaCWH;

import java.util.Scanner;

public class Lec80_TryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*  Without Try:
        int c = a / b;
        System.out.println("The result is " + c);
        // If b = 0, it will throw an exception
        */

        // With Try:
        try {
            int c = a/b ;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: "+e);
        }
        sc.close();
    }
}
