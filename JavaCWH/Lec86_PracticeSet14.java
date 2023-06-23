package JavaCWH;
import java.util.Scanner;

class Exc extends Exception{
    public String toString(){
        return "Maximum retries reached...";
    }
}

public class Lec86_PracticeSet14 {
    public static void main(String[] args) throws Exc {
        Scanner sc = new Scanner(System.in);
        
        // Problem - 1
        // Syntax Error --> int a = 7 (No Semicolon)

        // int age = 78;
        // int year_born = 2000-78; // Logical error
        // System.out.println(6/0);

        // Problem - 2 
        try {
            int a = 600/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Hii");
        }
        catch (IllegalArgumentException e){
            System.out.println("Thanks");
        }

        // Problem - 3
        /* int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        boolean b = true;
        int i = 0;
        while(b && i<5){
            int in = sc.nextInt();
            try{
                System.out.println(arr[in]);
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        } 
        if(i>=5){
            System.out.println("End Program...");
        } */

        // Problem - 4 & 5
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        boolean b = true;
        int i = 0;
        while(b && i<5){
            int in = sc.nextInt();
            try{
                System.out.println(arr[in]);
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        } 
        sc.close();
        if(i>=5){
            try{
                throw new Exc();
            }
            catch(Exception e){
                System.out.println(e);
            }
        } 
        
    }
}
