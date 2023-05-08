package JavaCWH;
import java.util.Scanner;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails() {
        System.out.println("My id number is: " + id);
        System.out.println("and my name is: " + name);
        System.out.println("and my salary is : "+salary);
    }
}

public class Lec38_CustomClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee himank = new Employee();
        himank.id = 1001;
        himank.name = "Himank";
        himank.salary = 10000000;
        himank.printDetails();
        System.out.println("");

        Employee lakshya = new Employee();
        lakshya.id = 1002;
        lakshya.name = "Lakshya";
        lakshya.salary = 10000000;
        lakshya.printDetails();

    }
}
