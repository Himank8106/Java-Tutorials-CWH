package JavaCWH;

@FunctionalInterface
interface Anony{
    void meth1(int a);    
    // void meth2();
}

// class AnonyFunc implements Anony{
//     @Override
//     public void meth1(int a){
//         System.out.println("I am meth1 of AnonyFunc.");
//     }
// } 

// class AnonyImp implements Anony{
//     @Override
//     public void meth1(){
//         System.out.println("I am meth1");
//     }

//     @Override
//     public void meth2(){
//         System.out.println("I am meth2");
//     }
// }

public class Lec109_AnonymousClassAndLambdaExpressions {
    public static void main(String[] args) {

        // AnonyImp an = new AnonyImp();
        // an.meth1();
        // an.meth2();

        // Anony a = new AnonyImp();
        // a.meth1();
        // a.meth2();

        // Anonymous Class
        // Anony ay = new Anony() {
        //     @Override
        //     public void meth1(){
        //         System.out.println("I am meth 1 of anonymous class");
        //     }
        //     @Override
        //     public void meth2(){
        //         System.out.println("I am meth 2 of anonymous class");
        //     }
        // };
        // ay.meth1();
        // ay.meth2();

        
        // Lambda Expression

        // Anony ann = new AnonyFunc();
        // ann.meth1(5);

        Anony obj = (a) -> {
            System.out.println("I am meth1 of Lambda");
        };
        obj.meth1(5);

    }
}

/*
Anonymous Class: A class that have no name is known as anonymous class in java. It should be used if you have to override method of class or interface. Java Anonymous class can be created by two ways:
    1. Class (may be abstract or concrete).
    2. Interface

Lambda Expression: A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method. 
They are used extensively in functional programming, and the Java API is full of them. They have been introduced in Java 8.
It is a function which can be created without belonging to any class. It is also known as an anonymous method.
It can be created for functional interface only. It means that interface which has only one abstract method. 
*/
