package JavaCWH;

public class Lec85_FinallyBlock{
    public static int greet(){
        try{
            int a = 10;
            int b = 0;                
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally will run no matter function return value and ends in try block itself.");
        }
        return -50;
    }
    public static void main(String[] args) {
        // Finally block is always executed whether exception is handled or not.
        // It is used to release resources.

        System.out.println(greet());

        int a = 5;
        int b = 4;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b - "+b);
            }
            b--;
        }
    }
}
