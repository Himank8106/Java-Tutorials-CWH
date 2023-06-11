package JavaCWH;

class Base1 {
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value x: "+x);
    }
}

class Derived1 extends Base1 {
    Derived1(){
        super(5);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded derived class constructor with value y: "+y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a childOf Derived class constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded childOfDerived class constructor with value z: "+z);
    }
}

public class Lec46_ConstructorsInInheritance {
    public static void main(String[] args) {
        Base1 b =new Base1(4);
        Derived1 d = new Derived1();
        Derived1 d1 = new Derived1(10,20);
        childOfDerived c = new childOfDerived(15,25,35);
    }
}
