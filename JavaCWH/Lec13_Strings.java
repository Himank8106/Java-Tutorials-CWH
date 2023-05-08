package JavaCWH;
import java.util.Scanner;

public class Lec13_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String("Himank");
        String name1 = "Himank";
        // uppar dono me se kuch bhi likh sakte ho
        System.out.println("The name is: "+name);
        System.out.println("The name is: "+name1);

        int a = 5;
        float b = 4.3256f;
        char d = 'A';
        System.out.printf("The value of a is %d and the value of b is %f ",a,b);
        System.out.format("\nThe value of a is %d & the value of b is %f",a,b);
        System.out.printf("\nThe value of d is %cHAXE",d);

    }
}
