package JavaCWH;

import java.io.FileWriter;

// Question - 1
class Mydeprecated{
    @Deprecated
    public void meth1(){
        System.out.println("Hiii");
    }
}

// Question - 3
interface MyInt{
    void abc();
}


public class Lec112_PracticeSet16{
    public static void main(String[] args) {

        // Question - 1
        // Mydeprecated md = new Mydeprecated();
        // md.meth1();

        // Question - 2
        @SuppressWarnings("")
        Mydeprecated md = new Mydeprecated();
        md.meth1();
        
        // Question - 3
        /* MyInt mi = new MyInt() {
            @Override
            public void abc(){
                System.out.println("I am interface");
            }
        }; */
        // By using lambda expression :-
        MyInt mi = () -> System.out.println("i am constructor");
        mi.abc();

        // Question - 4
        int i = 15;
        String table = "";
        for(int j=1; j<=10; j++){
            table += i+"X"+j+"="+(i*j)+"\n";
        }

        try {
            FileWriter fw = new FileWriter("MultiplicationTable.txt");
            fw.write(table);
            fw.close();
        } catch (Exception e) {
            System.out.println("Sorry");
            e.printStackTrace();
        }
    }
}