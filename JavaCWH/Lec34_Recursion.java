package JavaCWH;

public class Lec34_Recursion {
    // factorial(n) = n * factorial(n-1)

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int factorial_Iterative(int n){       // Without Recursion
        if(n==0 || n==1){
            return 1;
        }
        else{
           int product = 1;
           for(int i=1; i<=n; i++){
               product *= i;
           }
           return product;
        }
    }

    // Print counting 1 to n:-
        static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
        }
        }

    // Print counting n to 1:-
        static void fun2(int n){
        if(n>0){
            System.out.println(n);
            fun2(n-1);
        }
        }

    public static void main(String[] args) {
        int x = 5;
        System.out.printf("The factorial of number %d is: " + factorial(x) + "\n",x);
        System.out.printf("The factorial of number %d is: " + factorial_Iterative(x) + "\n",x);

        int y = 4;
        fun(y);
        fun2(y);
    }
}

