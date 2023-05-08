package JavaCWH;
import java.util.Scanner;

public class Lec25_PracticeSet5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        // Problem - 1
        int a = 5;
        for(int b=a; b>0; b--){
            for(int c=0; c<b; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        // Problem - 2
        System.out.print("Enter the first n even numbers:- ");
        int d = sc.nextInt();
        int sum = 0;
        for(int e=0; e<d; e++){
            sum += (2*e);
        }
        System.out.println("The sum of first " + d + "even numbers is:- "+sum);


        // Problem - 3  Multiplication table of given number
        System.out.print("Enter the number for which you want table:- ");
        int f = sc.nextInt();
        int g = 0;
        for(int h=1; h<=10; h++){
            g = (f*h);
            System.out.printf("%d * %d = %d\n",f,h,g);
        }


        // Problem - 4  Factorial of a number n
        System.out.print("Enter the number n for its factorial:- ");
        int i = sc.nextInt();
        int j = 1;
        int factorial = 1;
        while(j<=i){
            factorial *= j;
            j++;
        }
        System.out.println(factorial);


        // Problem - 5  Problem 4 using for loop
        System.out.print("Enter the number n for its factorial:- ");
        int i1 = sc.nextInt();
        int factorial1 = 1;
        for(int j1=1; j1<=i1; j1++){
            factorial1 *= j1;
        }
        System.out.println(factorial1);


        // Problem - 6  Sum of all the numbers in the table of number n
//        System.out.println("Enter the number:- ");
//        int k = sc.nextInt();
//        int l = 0;
//        int n = 0;
//        for(int m=1; m<=10; m++){
//            l = m*k;
//            n += l;
//        }
//        System.out.println(n);

        System.out.print("Enter the number:- ");
        int p = sc.nextInt();
        int sum1 = 0;
        for(int q=1; q<=10; q++){
            sum1 += p*q;
        }
        System.out.println(sum1);
    }
}
