package JavaCWH;

class Base{
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in Base class.");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am the Boss.");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class Lec45_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(555);
        System.out.println(b.getX());
        b.printMe();

        Derived d = new Derived();
        d.setX(20);
        System.out.println(d.getX());
        d.setY(55);
        System.out.println(d.getY());
    }
}
