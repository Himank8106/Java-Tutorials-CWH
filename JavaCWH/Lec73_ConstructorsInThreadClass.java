package JavaCWH;

// Constructor - Thread(String name)
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hii");
    }
}

// Constructor - Thread(Runnable r, String name)
class Parent3 extends Thread{
    Parent3(Runnable r, String name){
        super(r,name);
    }
}

class Run implements Runnable{
    public void run(){
        System.out.println("Runnable implemented successfully.");
    }
}

public class Lec73_ConstructorsInThreadClass {
    public static void main(String[] args) { 
        // Constructor - Thread(String name)
        MyThr t1 = new MyThr("Himank");
        t1.start();
        
        MyThr t2 = new MyThr("ABC");
        t2.start();

        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getId());
        System.out.println(t2.getName());

        // Constructor - Thread(Runnable r, String name)
        Run r = new Run();
        Parent3 p = new Parent3(r, "XYZ");
        p.start();

        System.out.println(p.getId());
        System.out.println(p.getName());

    }
}
