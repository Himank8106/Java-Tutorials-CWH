package JavaCWH;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
       return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void call(){
        System.out.println("Calling...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
}

class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int a;
    int b;
    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }
}

class Circle{
    float r;
    public float area(){
        return (22/7f)*r*r;
    }
    public float circumference(){
        return 2*(22/7f)*r;
    }
}

class Tommy{
    public void hitting(){
        System.out.println("Hitting the target...");
    }
    public void running(){
        System.out.println("Running behind the target...");
    }
    public void firing(){
        System.out.println("Firing on the target...");
    }
}

public class Lec39_PracticeSet8 {
    public static void main(String[] args) {
        // Problem - 1
        Employee1 himank = new Employee1();
        himank.setName("Himank Joshi");
        himank.salary = 10000000;
        System.out.println(himank.salary);
        System.out.println(himank.getSalary());
        System.out.println(himank.getName());

        // Problem - 2
        CellPhone himank1 = new CellPhone();
        himank1.call();
        himank1.vibrate();
        himank1.ring();

        // Problem - 3
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem - 4
        Rectangle rec = new Rectangle();
        rec.a = 3;
        rec.b = 4;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

        // Problem - 5
        Circle cir = new Circle();
        cir.r = 9;
        System.out.println(cir.area());
        System.out.println(cir.circumference());

        // Problem - 6
        Tommy tom = new Tommy();
        tom.hitting();
        tom.firing();
        tom.running();
    }
}
