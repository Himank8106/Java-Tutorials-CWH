package JavaCWH;

interface MyCamera1{
    void takePhoto();
    void recordVideo();
    private void greet(){
        System.out.println("Hiiii");
    }
    default void recordIn4k(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi1{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyPhone1{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone1 extends MyPhone1 implements MyCamera1,MyWifi1{
    public void takePhoto(){
        System.out.println("Capturing Photo...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    // We can also override the default method of interface and system will print default method of subclass.
    // public void recordIn4k(){
    //     System.out.println("Recording in 4k from subclass...");
    // }
    public String[] getNetworks(){
        System.out.println("Getting network information : ");
        String[] networkList = {"Ntwk1","Ntwk2","Ntwk3"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void sampleMeth(){
        System.out.println("Method");
    }
}

public class Lec59_Polymorphism {
    public static void main(String[] args) {
        MyCamera1 cam = new MySmartphone1();  // This is a smartphone, but used as camera
        // Similar to dynamic method dispatch in inheritance
        cam.recordIn4k();
        // cam.getNetworks(); --> Throws an error (Not allowed)
        // cam.sampleMeth(); --> Not allowed (It allows only MyCamera1 class's methods)
        System.out.println("");
        
        MySmartphone1 ms = new MySmartphone1();
        ms.pickCall();
        ms.recordIn4k();
        ms.callNumber(555);
        // Here, you can call all the methods of every class

    }
}
