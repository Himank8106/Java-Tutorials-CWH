package JavaCWH;

class MyRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<300){
            System.out.println("Thread 1 is running.");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<300){
            System.out.println("Thread 2");
            i++;
        }
    }
}

public class Lec71_CreatingThreadUsingRunnableInterface {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }    
}
