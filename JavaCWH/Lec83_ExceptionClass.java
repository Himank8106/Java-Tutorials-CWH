package JavaCWH;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am String.";
    }
    
    @Override
    public String getMessage(){
        return "I am getMessage().";
    }
}

public class Lec83_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if(a<10){
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage()); 
                System.out.println(e.toString()); 
                e.printStackTrace();
                System.out.println("Hii");
            }
        }
    }
}
