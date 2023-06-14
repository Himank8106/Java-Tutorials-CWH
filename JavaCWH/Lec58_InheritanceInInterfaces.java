package JavaCWH;

interface inter1{
    void meth1();
    void meth2();
}

interface inter2 extends inter1{
    void meth3();
    void meth4();
}

class MyClass implements inter2{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class Lec58_InheritanceInInterfaces {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.meth1();       
        mc.meth2();
        mc.meth3();
        mc.meth4();
    }
}
