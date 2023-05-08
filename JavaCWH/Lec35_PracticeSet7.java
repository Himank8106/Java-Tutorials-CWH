package JavaCWH;
import java.util.Scanner;

public class Lec35_PracticeSet7 {
    // Question - 1
    static void table(int n){
        for(int a=1; a<=10; a++){
            System.out.printf("%d x %d = %d\n",n,a,n*a);
        }
    }

    // Question - 2
    static void pattern(int m){
        for(int d=1; d<=m; d++) {
            for (int e = 1; e <= d; e++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }

    // Question - 3
    static int nsum(int p){
        if(p==1){
            return 1;
        }
        return p+nsum(p-1);
    }

    // Question - 4
    static int fibo(int r){
        if (r==1 || r==2){
            return r-1;
        }
        else{
           return  fibo(r-1)+fibo(r-2);
        }
    }

    //Question - 6
    static float average(int...arr){
        float sum = 0;
        for(int element: arr){
            sum += element;
        }
        sum /= arr.length;
        return sum;

    }

    // Question - 7
      // (0°C × 9/5) + 32 = 32°F
    static float convert(float s){
        float fahrenheit = (s*9/5)+32;
        return fahrenheit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question - 1
            int b = sc.nextInt();
            table(b);

        // Question - 2
            int c = sc.nextInt();
            pattern(c);

        // Question - 3
            int f = sc.nextInt();
            int g =nsum(f);
            System.out.println(g);

        // Question - 4
            int h = sc.nextInt();
            int i = fibo(h);
            System.out.println(i);

        // Question - 5  (Fibonacci Series)
            int j = sc.nextInt();
            for(int k=1; k<=j; k++){
                System.out.print(fibo(k)+" ");
            }
            System.out.println("");

        // Question - 6
            System.out.println("Average: "+average(5,6,7,8));

        // Question - 7
            float l  = sc.nextFloat();
            float m = convert(l);
            System.out.println(m);

    }
}
