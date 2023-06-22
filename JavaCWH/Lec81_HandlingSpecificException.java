package JavaCWH;

import java.util.Scanner;

public class Lec81_HandlingSpecificException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;

        System.out.print("Enter the dividend index number: ");
        int d = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int f = sc.nextInt();

        try {
            System.out.println("Dividend value is: "+num[d]);
            System.out.println("Final value is: "+(num[d]/f));
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occured!!");
            System.out.println("Reason - "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Given index number is out of the range.");
            System.out.println("Reason - "+e);
        }
        // If any other exception occured, then it will show in the last catch block.
        catch (Exception e) {
            System.out.println("Some exception occured!!");
            System.out.println("Reason - "+e);
        }

        sc.close();
    }
}
