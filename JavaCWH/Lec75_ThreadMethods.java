package JavaCWH;

class MyThrd1 extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Hii");
            // Thread.sleep(3000); will print 'Hii' after every 3 seconds
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();   // TODO Auto-generated catch block 
                }
            i++;
        }
    }
}

class MyThrd2 extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Thanks");
            i++;
        }
    }
}

public class Lec75_ThreadMethods {
    public static void main(String[] args) {
        MyThrd1 t1 = new MyThrd1();
        MyThrd2 t2 = new MyThrd2();

        t1.start();

        // 'Join' is a synchronization method that blocks the calling thread (that is, the thread that calls the method) 
        //until the thread whose Join method is called has completed.
        // t1.join(); will print 'Thanks' after 'Hii' is printed 200 times
        /*  try{
               t1.join();
           }
           catch(Exception e){
               System.out.println(e);
           }
        */

        t2.start();
    }
}
