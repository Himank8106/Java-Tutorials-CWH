package JavaCWH;

class A{
    public int a;
    public int harry(){
        return 10;
    }

    public void meth1(){
        System.out.println("I am meth1 of class A.");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am meth1 of class B.");
    }
    public void meth2(){
        System.out.println("I am meth2 of class B.");
    }

}

public class Lec48_MethodOverriding {
    public static void main(String[] args) {
        A aa = new A();
        aa.meth1();
        B bb = new B();
        bb.meth1();
        bb.meth2();
    }
}
