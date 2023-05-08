package JavaCWH;

abstract class Parent {
    Parent() {
        System.out.println("I am constructor of Parent class.");
    }
    public void Hello() {
        System.out.println("Hi from parent class.");
    }
    abstract public void Greet();
    abstract public void Greet2();
}

class Child extends Parent{
    @Override
    public void Greet(){
        System.out.println("Hello from Child class.");
    }
    @Override
    public void Greet2(){
        System.out.println("Hi!!!!!");
    }
    @Override
    public void Hello(){
        System.out.println("hhvbcd");
    }
}

abstract class Child1 extends Parent{
        public void c2(){
            System.out.println("Hello!!!!!");
        }
}

public class Lec53_AbstractClassesAndMethods {
    public static void main(String[] args) {
//      Parent p = new Parent();  --> Throws error because it is not possible to create object of an abstract class.
//      Child1 c = new Child1();  --> Same reason.
        Child c1 = new Child();
        c1.Greet();
        c1.Hello();

        Parent p1 = new Child();
        p1.Hello();
    }
}


