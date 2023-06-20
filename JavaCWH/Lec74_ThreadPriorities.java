package JavaCWH;

/* 
   Values of Priorities:
   MAX_PRIORITY = 10
   MIN_PRIORITY = 1
   NORM_PRIORITY = 5 
*/

class MyThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Hii "+ this.getId());
            i++;
        }
    }
}

public class Lec74_ThreadPriorities {
    public static void main(String[] args) {
        // Ready Queue - T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1();
        MyThr1 t2 = new MyThr1();
        MyThr1 t3 = new MyThr1();
        MyThr1 t4 = new MyThr1();
        MyThr1 t5 = new MyThr1();

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);  
        t3.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.MIN_PRIORITY);  
        t1.setPriority(Thread.MIN_PRIORITY);  

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(t1.getPriority());    
        System.out.println(t2.getPriority());   
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        System.out.println(t5.getPriority());

    }
}

