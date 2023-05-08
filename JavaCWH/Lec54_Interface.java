package JavaCWH;

interface Bicycle{
    int a = 555;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{
    void horn(){
        System.out.println("Pee Poo Pee Poo.");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Brake");
    }                                        //Agar interface ko define kar rhe ho to us method ko public banana padega.
    public void speedUp(int increment){
        System.out.println("Accelerating");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class Lec54_Interface {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBreak(5);
        System.out.println(ac.a);

        // You cannot modify the properties in Interfaces as they are final
        // ac.a = 454;
        //System.out.prinln(ac.a);

        ac.blowHornmhn();
        ac.blowHornK3g();
    }
}
