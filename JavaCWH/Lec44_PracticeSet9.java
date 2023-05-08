package JavaCWH;

class Cylinder {
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

/*    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
 */
    public double surfaceArea(){
        return ((Math.PI*2*radius*height)+(Math.PI*2*radius*radius));
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
    }
}

class Rectangle1 {
    private float length;
    private float breadth;

    public Rectangle1(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public float getLength() {
        return length;
    }
    public float getBreadth() {
        return breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class Lec44_PracticeSet9 {
    public static void main(String[] args) {
/*        // Problem - 1
        Cylinder cy = new Cylinder();
        cy.setHeight(5);
        cy.setRadius(10);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
 */
        // Problem - 2 & 3
        Cylinder cy = new Cylinder(12,9);
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());

        //Problem - 4
        Rectangle1 r = new Rectangle1(5,10);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
