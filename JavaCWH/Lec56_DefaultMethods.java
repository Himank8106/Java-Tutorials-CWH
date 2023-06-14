package JavaCWH;

interface MyCamera{
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

interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyPhone{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone extends MyPhone implements MyCamera,MyWifi{
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
}

public class Lec56_DefaultMethods{
    public static void main(String[] args) {
        MySmartphone sp = new MySmartphone();
        sp.recordIn4k();

        // sp.greet(); --> Throws an error because it is undefined for MySmartphone

        String[] ar = sp.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        } 
    }
}
