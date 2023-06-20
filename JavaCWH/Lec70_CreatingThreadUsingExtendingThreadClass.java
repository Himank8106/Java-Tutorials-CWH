package JavaCWH;

class Thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<300){
            System.out.println("Thread 1 is Running");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<300){
            System.out.println("Thread 2");
            i++;
        }
    }
}

public class Lec70_CreatingThreadByExtendingThreadClass {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }    
}
