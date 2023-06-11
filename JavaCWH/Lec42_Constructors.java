package JavaCWH;

class Empolyee3 {
    private int id;
    private String name;
    public Empolyee3(){
        id = 1;
        name = "Himank";
    }
    public Empolyee3(String s, int i){
        id = i;
        name = s;
    }
    public String getName() {
        return name;
    }
/*    public void setName(String n) {
        name = n;
    }
    public void setId(int i) {
        id = i;
   }
*/

    public int getId() {
        return id;
    }
}

class Employee4 {
    // First constructor
    Employee4 (String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
    //    Constructor overloaded
    Employee4 (String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }
}

public class Lec42_Constructors {
    public static void main(String[] args) { 
        Empolyee3 himank = new Empolyee3();
        System.out.println(himank.getName());
        System.out.println(himank.getId());

        Empolyee3 himank1 = new Empolyee3("Himank Joshi",5);
        System.out.println(himank1.getName());
        System.out.println(himank1.getId());

        Employee4 himank2 = new Employee4("Himank",1);
        Employee4 himank3 = new Employee4("Himank",2,10000000);
    }
}
