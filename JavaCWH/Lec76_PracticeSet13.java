package JavaCWH;

class MyThr2 extends Thread{
    public void run(){
        int i = 0;
        while(i<200){
            System.out.println("Hii");
            i++;
        }
    }
} 

class MyThr3 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thanks");
            i++;
        }
    }
} 

public class Lec76_PracticeSet13 {
    public static void main(String[] args) {
        // Que 1 + 2
        MyThr2 t1 = new MyThr2();
        MyThr3 t2 = new MyThr3();
        t1.start();
        t2.start();

        // Que 3
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // Que 4
        System.out.println(t1.getState());  // --> RUNNABLE
        System.out.println(t1.getState());  // --> BLOCKED
        // Print the current state of Thread i.e. NEW, RUNNABLE, RUNNING, TERMINATED

        // Que 5
        System.out.println(Thread.currentThread().getState()); // --> RUNNABLE

    }
}
