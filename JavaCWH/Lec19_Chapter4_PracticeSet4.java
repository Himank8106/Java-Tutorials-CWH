package JavaCWH;
import java.util.Scanner;

public class Lec19_Chapter4_PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 - Check whether a student is pass or fail
        System.out.println("Enter you marks:-");
        System.out.print("Subject 1 - ");
        float a = sc.nextFloat();
        System.out.print("Subject 2 - ");
        float b = sc.nextFloat();
        System.out.print("Subject 3 - ");
        float c = sc.nextFloat();
        float d = ((a + b + c) / 3);
        System.out.println("Percentage: " + d + "%");
        if (a >= 33 && b >= 33 && c >= 33 && d >= 40) {
            System.out.println("Congratulations,you passed the exam!!");
        } else {
            System.out.println("Sorry,you are failed.");
        }




        // Problem 2 - Calculate income tax slab according to income
//        System.out.print("Enter your income: ");
//        float e = sc.nextFloat();
//        System.out.print("You have to pay ");
//        if (e > 250000 && e <= 500000) {
//            System.out.print("5% tax.");
//        } else if (e > 500000 && e <= 1000000) {
//            System.out.print("20% tax.");
//        } else if (e > 1000000) {
//            System.out.println("30% tax.");
//        } else {
//            System.out.println("no tax.");
//        }

        // Problem 2 - Calculate income tax slab according to income
                                // By CWH
        System.out.print("Enter your income: ");
        float income = sc.nextFloat();
        float tax = 0f;
        if (income<=250000f){
            tax = tax + 0f;
        }
        else if (income>250000f && income<=500000f) {
            tax = tax + 0.05f*(income-250000f);
        }
        else if (income>500000f && income<=1000000f){
            tax = tax + 0.05f*(500000f-250000f);
            tax = tax + 0.2f*(income-500000f);
        }
        else if (income>1000000f){
            tax = tax + 0.2f*(500000f-250000f);
            tax = tax + 0.2f*(1000000f-500000f);
            tax = tax + 0.3f*(income-1000000f);
        }
        System.out.println("So, the total tax to pay is "+tax);




        // Problem 3 - Find out the day of the week by number assigned to it
        System.out.print("Enter number for the given day (1 to 7): ");
        int f = sc.nextInt();
        switch (f) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please select number between 1 to 7");
        }




        // Problem 4 - Find whether a year entered by user is a leap year or not
        System.out.print("Enter the year: ");
        int g = sc.nextInt();
        if(g%100==0){
            if(g%100==0 && g%400==0){
                System.out.println("Yes, %g is a leap year.");
                }
            else{
                System.out.println("No, %g is not a leap year.");
            }
        }
        else if(g%4==0){
            System.out.println("Yes, %g is a leap year");
        }
        else{
            System.out.println("No, %g is not a leap year");
        }
        sc.nextLine();
        // Here,sc.nextline(); is for problem 5





        // Problem 5 - Program to find out the type of website from the URL(Top Level Domain (TLD) names)
        System.out.print("Enter the website name: ");
        String str = sc.nextLine();
        if(str.endsWith(".in")){
            System.out.println("It is an Indian website.");
        }
        else if (str.endsWith(".org")){
            System.out.println("It is an organizational website.");
        }
        else if (str.endsWith(".com")){
            System.out.println("It is a commercial website.");
        }
        else {
            System.out.println("Sorry, we don't know.");
        }
    }
}
