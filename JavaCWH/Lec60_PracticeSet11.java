package JavaCWH;

// Question 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Question 2 
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing the nib...");
    }
}

// Question 3 & 5
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

// Question 6 & 7
interface SmartTVRemote{
    void remote();
}

interface TVRemote extends SmartTVRemote{
    void tvRemote();
}

class TV implements TVRemote{
    public void tvRemote(){
        System.out.println("TV Remote");
    }
    public void remote(){
        System.out.println("Smart TV Remote");
    }
}

public class Lec60_PracticeSet11 {
    public static void main(String[] args) {
        // Question 1 & 2
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        // Question 3
        Human h = new Human();
        h.eat();
        h.sleep();

        // Question 5
        Monkey m = new Human();
        // m.eat(); --> Not Allowed
        m.bite();
        m.jump();

        // Question 6 & 7
        TV t = new TV();
        t.tvRemote();
        t.remote();

    }
}
