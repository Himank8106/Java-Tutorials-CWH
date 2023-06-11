package JavaCWH;

public class Lec24_Break$ContinueInLoop {
    public static void main(String[] args) {

        // Break
        for(int i=1; i<=3; i++){
            System.out.println(i);
            System.out.println("Have a nice day!!");
            if (i==2){
                System.out.println("Good night.");
                break;
            }
        }

        int j = 0;
        while(j<=3){
            System.out.println("Good Morning");
            if(j==2){
                System.out.println("Good Night");
                break;
            }
            j++;
        }

        int k = 0;
        do{
            System.out.println("Hi");
            if(k==2){
                System.out.println("By");
            break;
            }
            k++;
        }while(k<5);

        // Continue
        for(int l=1; l<=3; l++){
            if (l==2){
                System.out.println("Good night.");
                continue;
            }
            System.out.println(l);
            System.out.println("Have a nice day!!");
        }

        int m = 0;
        while(m<=3){
            if(m==2){
                System.out.println("Good Night");
                m++;
                continue;
            }
            System.out.println("Good Morning");
            m++;
        }

        int n = 0;
        do{
            if(n==2){
                System.out.println("By");
                n++;
                continue;
            }
            System.out.println("Hi");
            n++;
        }while(n<5);
    }
}
