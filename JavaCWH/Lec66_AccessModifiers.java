package JavaCWH;

class C1{
    public int a = 5;
    protected int b = 6;
    int c = 7;
    private int d = 8;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Lec66_AccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        // System.out.println(c.d);   --> Throws Error (Since d is private and can't be accessed outside the class)
    }
}
