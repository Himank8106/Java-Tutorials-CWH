package JavaCWH;

public class Lec9_PrecedenceAndAssociativity {
    public static void main(String[] args) {
        /*
        '*,/' ki precedence '+,-' se jyada hoti hai to vo pehle calculate honge
        agar same precedence ke do operator hai to associativity lagayenge
        i.e. Left to Right Associativity se calculate karenge jo pehle aaya us precedence ka vo calculate hoga
        */
        int n = 6*5-20+8/4;
        // 30-20+8/4 = 30-20+2 = 10+2 = 12
        System.out.println(n);

        // (b^2-4ac)/2a
        float a = 4;
        float b = 6;
        float c = 2;
        float d = (b*b-4*a*c)/(2*a);
        System.out.println(d);

    }
}
