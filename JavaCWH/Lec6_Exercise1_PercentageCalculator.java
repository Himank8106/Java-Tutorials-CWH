package JavaCWH;
import java.util.Scanner;

//first one is made by me and second one is by harry

 public class Lec6_Exercise1_PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Marks: ");
        float h = sc.nextFloat();
        System.out.println("Enter the marks for the subjects:- ");
        System.out.print("Subject 1: ");
        float a = sc.nextFloat();
        System.out.print("Subject 2: ");
        float b = sc.nextFloat();
        System.out.print("Subject 3: ");
        float c = sc.nextFloat();
        System.out.print("Subject 4: ");
        float d = sc.nextFloat();
        System.out.print("Subject 5: ");
        float e = sc.nextFloat();
        System.out.print("Total marks out of "+(h*5)+" are: ");
        float f = a+b+c+d+e ;
        System.out.println(f);
        float g = (f/(h*5))*100;
        System.out.print("Percentage: "+g+"%");
    }
 }


//This code has 3 subjects and maximum marks are 100
//class Subject{
//    int max = 100;
//    int obtd;
//}
//
//public class Lec6_PercentageCalculator {
//    public static void main(String[] args) {
//        Subject s1 = new Subject();
//        System.out.print("Enter Maths marks: ");
//        Scanner sc = new Scanner(System.in);
//        s1.obtd = sc.nextInt();
//        Subject s2 = new Subject();
//        System.out.print("Enter Science marks: ");
//        s2.obtd = sc.nextInt();
//        Subject s3 = new Subject();
//        System.out.print("Enter English marks: ");
//        s3.obtd = sc.nextInt();
//        int tobtd = (s1.obtd) + (s2.obtd) + (s3.obtd) ;
//        int per = (tobtd*100/300);
//        System.out.print("Percentage obtained: "+per);
//
//    }
//}