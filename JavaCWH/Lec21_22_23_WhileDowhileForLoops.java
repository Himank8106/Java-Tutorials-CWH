package JavaCWH;
import java.util.Scanner;

public class Lec21_22_23_WhileDowhileForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        System.out.println("After using while loop: ");
        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++;
        }

        char b = 'A';
        while (b<='Y') {
                System.out.print(b + ",");
                b++;
            }
        while(b=='Z'){
                System.out.println(b + ".");
                b++;
            }
//       System.out.print("\n");


        int c = 1;
        do{
            System.out.print(c);
            c++;
        } while(c<5);
        System.out.print("\n");



        int d = 10;
        do{
            System.out.println(d);
            d++;
        }while(d<5);


        for(int i=1; i<=5; i++){
            System.out.print(i);
        }
        System.out.print("\n");


        // Quiz - Program to print first n odd numbers using for loop
        System.out.print("Enter the number \"n\": ");
        int e = sc.nextInt();
        System.out.print("So,the first \"n\" odd numbers are:- ");
        for (int f= 1; f<=e; f++) {
            while (f <= (e - 1)) {
                System.out.print((2 * f - 1) + ",");
                f++;
            }
            while (f == e) {
                System.out.println((2 * f - 1) + ".");
                f++;
            }
        }

        // Decrementing for loop
        for (int j = 3; j>=0; j--){
            System.out.print(j);
        }
        System.out.print("\n");

        for (int k = 4; k!=0; k--){
            System.out.print(k);
        }
        System.out.print("\n");

    }
}
