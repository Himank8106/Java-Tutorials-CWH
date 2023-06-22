package JavaCWH;

class NegValue extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative!!";
    }
}

public class Lec84_ThrowAndThrows {
    public static int divide(int a, int b) throws ArithmeticException {
        int c;
        c = a/b;
        return c;
    }

    public static double area(int r) throws NegValue {
        if(r<0){
            throw new NegValue();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        try {
            // int c = divide(10, 0);
            // System.out.println(c);
            double ar = area(-5);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception occured!!");
            System.out.println("Reason - "+e);
        }
    }
}
