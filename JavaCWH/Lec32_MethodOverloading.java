package JavaCWH;

public class Lec32_MethodOverloading {
    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }   // Void returns nothing(i.e. int,string,etc.)

    static void change(int a){
        a=70;
    }

    static void change2(int[] arr){
        arr[0]=100;
    }

    static void foo(){
        System.out.println("Good Morning");
    }

    static void foo(int b){
        System.out.println("Good Evening");
    }

    static void foo(int b,String c){
        System.out.println(b+" times good evening "+c);
    }

    public static void main (String[]args) {
        tellJoke();

        // Case 1 - Changing the integer:-
        int x = 30;
        change(x);
        System.out.println(x);  // returns 30 not 70

        // Case 2 - Changing the array:-
        int[] marks = {10,20,30,40,50};
        change2(marks);
        System.out.println(marks[0]); // returns 100 not 10
        // In case of arrays, the reference is passed. Same is the case for object passing to methods.

        // Method Overloading:-
        foo();
        foo(500);
        foo(10,"bro!!");     // Here 10 and "bro!!" is argument and 'b' and 'c' are parameters.

    }
}
