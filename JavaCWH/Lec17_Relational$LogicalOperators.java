package JavaCWH;

public class Lec17_Relational$LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        if(a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println(!a);
        System.out.println(!a || !b);

    }
}
