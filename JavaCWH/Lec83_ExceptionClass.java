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
                /* This method prints the stack trace of the exception, including the line numbers and method calls that 
                   led to the exception. It helps in debugging the code by showing where the exception occurred.  */
                System.out.println("Hii");
            }
        }
    }
}
