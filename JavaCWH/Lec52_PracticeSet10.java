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

class rectangle
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
class cuboid extends rectangle
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

        rectangle rec = new rectangle();

        // Problem - 2
        cuboid obj = new cuboid();
        rec.setWidth(5);
        rec.setBreadth(8);
        obj.setHeight(10);
        obj.setWidth(6);
        obj.setBreadth(3);
        System.out.println("The width of the rectangle is "+rec.getWidth());
        System.out.println("The breadth of the rectangle is "+rec.getBreadth());
        System.out.println("The area of the rectangle is "+rec.area());
        System.out.println("The width of the cuboid is "+obj.getWidth());
        System.out.println("The breadth of the cuboid is "+obj.getBreadth());
        System.out.println("The height of the cuboid is "+obj.getHeight());
        System.out.println("The volume of the cuboid is "+obj.volume());
    }
}
