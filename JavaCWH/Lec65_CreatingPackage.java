package JavaCWH;

// import java.util.Scanner;

// import java.util.*;  --> This will import everything from utility class (e.g. Scanner, Random, etc..)

public class Lec65_CreatingPackage {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // We can also import directly
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as "+a);
        sc.close();
    }
}


/*
    The javac command is used to compile Java programs, it takes .java file as input and produces bytecode. 
    Following is the syntax of this command.
    It will create a new class file from .java file
    >>>  javac Lec65.java

    The java command is used to execute the bytecode of java. It takes byte code as input and runs it and produces the output. 
    Following is the syntax of this command.
    >>> java Lec65

    >>> javac -d . Lec65.Java --> To create a class file for a .java file which is in a package, then have to execute this command. 

    package Company1.Sub1; --> It is a subpackage/subfolder in Company1 package

    >>> javac -d . *.java  --> It will create class file for all the .java files of the package 

    We can import a class in another class in a package
    import JavaCWH.Lec59_Polymorphism;

    Also can import all classes in a class by using *
    import JavaCWH.*;
*/