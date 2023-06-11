package JavaCWH;

class EkClass{
    int a;
    EkClass(int a){
        this.a = a;
    }
    public int getA() {
        return a;
    }
}

class DoClass extends EkClass{
    DoClass(int b){
        super(20);   // b bhi likh sakte the if we want to give value of a as 15
        System.out.println("Hi");
    }
}

public class Lec47_ThisAndSuperKeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());

        DoClass d = new DoClass(15);
        System.out.println(d.a);
    }
}
