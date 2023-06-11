package JavaCWH;

public class Lec31_Methods {
    static int mysum(int x, int y){
        int z;
        if(x>=y) {
            z=x+y;
        }
        else{
            z=(x*y);
        }
        x=555;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;

        // Method invocation using object creation
        //Lec31_Methods obj = new Lec31_Methods();
        //c = obj.mysum(a,b);
        // Agar hum mysum wale function me static nahi likhte aur agar is main class me define karna hota
        //to hum object create karke define kar sakte hai.
        // object banane se hum non-static function ko static me define kar sakte hai
        // otherwise static method se static method hi call kar sakte hai,non-static nahi


        c = mysum(a,b);
        System.out.println(c);

        int a1 = 4;
        int b1 = 2;
        int c1;
        c1 = mysum(a1,b1);
        System.out.println(c1);

    }
}
