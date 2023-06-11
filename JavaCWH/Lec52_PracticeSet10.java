package JavaCWH;

class Circle1{
    public int radius;
    Circle1(int r){
        this.radius = r;
    }
    public double area(){
        return (Math.PI*this.radius*this.radius);
    }
}

class Rctangle
{
    private float width,breadth;
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    float area()
    {
        return width*breadth;
    }
}
class cuboid extends Rctangle
{
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    float volume()
    {
        return area()*height;
    }
}

class Cylinder1 extends Circle1{
    public  int height;
    Cylinder1(int t, int h){
        super(t);
        this.height = h;
    }
    public  double volume() {
        return (Math.PI * this.radius * this.radius * height);
    }
}

public class Lec52_PracticeSet10 {
    public static void main(String[] args) {
        // Problem - 1
        Cylinder1 cy = new Cylinder1(5,10);
        System.out.println(cy.area());
        System.out.println(cy.volume());

        
        // Problem - 2
        Rctangle rec = new Rctangle();
        cuboid obj = new cuboid();
        rec.setWidth(5);
        rec.setBreadth(8);
        obj.setHeight(10);
        obj.setWidth(6);
        obj.setBreadth(3);
        System.out.println("The width of the Rectangle is "+rec.getWidth());
        System.out.println("The breadth of the Rectangle is "+rec.getBreadth());
        System.out.println("The area of the Rectangle is "+rec.area());
        System.out.println("The width of the cuboid is "+obj.getWidth());
        System.out.println("The breadth of the cuboid is "+obj.getBreadth());
        System.out.println("The height of the cuboid is "+obj.getHeight());
        System.out.println("The volume of the cuboid is "+obj.volume());
    }
}

// class Circle{
//     int radius;
//     Circle(int r){
//         this.radius = r;
//     }
//     public double area(){
//         return (Math.PI*this.radius*this.radius);
//     }
// }

// class Cylinder extends Circle{
//     int height;
//     Cylinder(int rr, int h){
//         super(rr);
//         this.height = h;
//     }
//     public double volume(){
//         return (Math.PI*this.radius*this.radius*this.height);
//     }
// }

// class Rectangle{
//     int length;
//     int breadth;
//     Rectangle(int l, int b){
//         this.length = l;
//         this.breadth = b;
//     }
//     public float area(){
//         return length*breadth;
//     }
// }

// class Cuboid extends Rectangle{
//     int height;

//     Cuboid(int x, int y, int z){
//         super(x,y);
//         this.height = z;
//     }
//     public float volume(){
//         return area()*height;
//     }
// }

// public class PS {
//     public static void main(String[] args) {
//         Circle c = new Circle(5);
//         System.out.println(c.area());

//         Cylinder cy = new Cylinder(6,10);
//         System.out.println(cy.area());
//         System.out.println(cy.volume());

//         Rectangle r = new Rectangle(10,20);
//         System.out.println(r.area());

//         Cuboid cb = new Cuboid(20,30,40);
//         System.out.println(cb.area());
//         System.out.println(cb.volume());

//     }
// }
