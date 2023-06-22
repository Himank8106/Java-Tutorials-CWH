package JavaCWH;

import java.util.Scanner;

public class Lec78_ErrorAndExceptionInJava {
    public static void main(String[] args) {
        /* Error and Exception in Java
        1. Syntax Error
        2. Logical Error
        3. Runtime Error
        */ 

        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }
        // It will print 9 also which is not a prime number

       // RUNTIME ERROR DEMO
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
        // If k = 0, it will throw an exception

        sc.close();
        
    }
}
