package JavaCWH;

public class Lec10_ResultingDataType {
    public static void main(String[] args) {
        byte a = 3;
        int b = 6;
        short c = 5;
        int d = b+c;
        float e = 7.65f + a;
        System.out.println(e);

        int y = 5;
        char z = 'A';  // Will convert 'A' into ASCII Code which is 65. So 65+5 = 70 (int+char -> Resulting datatype -> int)
        System.out.println(y+z);


        //Increment and Decrement Operator
        //f++ me f pehle ek baar asssigned(USE) hota hai then increment hota hai
        //USE kahi bhi ho sakta hai i.e. sout me ya int,float,etc. me
        //lekin ++f me f pehle increment hota hai fir assigned hota hai

        float f = 9.99f ;
        System.out.println(f++);
        System.out.println(f);
        System.out.println(++f);
        System.out.println(f);

        int g = 5;
        int h = g++ + 5;
        System.out.println(h);
        System.out.println(g);

        int k = 5;
        System.out.println(++k * 8);
        // ++ ki precedence * se jyada hoti hai to pehle ++k calculate hoga
        // ++k*8 = 6*8 = 48

        char i = 'A';
        char j = 'd';
        System.out.println(++i);
        System.out.println(++j);


    }
}
