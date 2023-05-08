package JavaCWH;

class Empolyee2 {
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
//      this.name = n; dono likh sakte hai
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

class Circle2 {
    private float radius,area,circumference;

    void setRadius(float r){
        radius = r;
    }
    void setArea(float a){
        if (a == 22*radius*radius/7){
            area = a;
        }
        else
            System.out.println("Wrong Data");
    }

    void setCircumference(float c){
        if (c == 2*22*radius/7){
            circumference = c;
        }
        else
            System.out.println("Wrong Data");
    }

    float getRadius(){
        return radius;
    }

    float getArea(){
        return area;
    }

    float getCircumference(){
        return circumference;
    }
}

public class Lec40_GettersAndSetters {
    public static void main(String[] args) {
        Empolyee2 himank = new Empolyee2();
//      himank.id = 50;
//      himank.name = "Himank Joshi"; --> Throws an error due to private access modifier

        himank.setName("Himank Joshi");
        System.out.println(himank.getName());
        himank.setId(555);
        System.out.println(himank.getId());

        Circle2 cr = new Circle2();
        cr.setRadius(9.0f);
        cr.setArea(254.571428571428f);
        cr.setCircumference(56.5714285f);
        System.out.println(cr.getArea());
        System.out.println(cr.getCircumference());
    }
}

