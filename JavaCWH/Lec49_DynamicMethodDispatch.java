package JavaCWH;

class Phone{
    public void greet(){
        System.out.println("Hello");
    }
    public void name1(){
        System.out.println("I am Phone.");
    }
}

class Smartphone extends Phone{
    public void namaskar(){
        System.out.println("Swagat");
    }
    public void name1(){
        System.out.println("I am Smartphone.");
    }
}

public class Lec49_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.name1();
        
        Phone ph1 = new Smartphone();
        ph1.greet();    // Allowed
        ph1.name1();    // Allowed
        
        //      ph1.namaskar();    Not Allowed
        //      To print ph1.namaskar(); --> You have to create new object for Smartphone
        Smartphone sph = new Smartphone();
        sph.namaskar();
    }
}
