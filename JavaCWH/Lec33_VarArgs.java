package JavaCWH;

public class Lec33_VarArgs {
    static int foo(int a,int b){
        return a+b;
    }
    static int foo(int a,int b,int c){
        return a+b+c;
    }
    static int foo(int a,int b,int c,int d){
        return a+b+c+d;
    }
// if we have to do it for 100 times,then it will not be easy.

    static int foo(int ...arr){
        int result = 0;
        for(int x: arr){
            result += x;
        }
        return result;
    }

    // can also add an function bar, but isme ek element hona compulsary hai
        static int foo2(int e,int ...arr){
        int result = e;
        for(int x: arr){
            result += x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 5 and 6 is: "+foo(5,6));
        System.out.println("the sum of 5,6 and 7 is: "+foo(5,6,7));
        System.out.println("the sum of 5,6,7 and 8 is: "+foo(5,6,7,8));

        // from variable argument
            System.out.println("the sum of whatever no. of numbers is: " + foo(5,6,7,8,9,10,11,12));
            System.out.println("the sum of whatever no. of numbers is: "+foo());
            // isme array me koi element nahi hai to return ki value 0 hi reh gayi, so output is 0

        // can also add an function bar, but isme ek element hona compulsary hai
            System.out.println("the sum of whatever no. of numbers is: "+foo2(2,5,6,7));
            // e me input dena hi padega

    }
}
