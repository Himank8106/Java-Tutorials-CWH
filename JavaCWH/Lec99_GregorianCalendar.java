package JavaCWH;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Lec99_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g);

        System.out.println(g.isLeapYear(2020));   // --> Returns true/false

        System.out.println("The hashcode for this calendar is : "+ g.hashCode());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        // true = rolls up the value by 1.
        // false = rolls down the value by 1.
        g.roll(Calendar.MONTH, true);    // --> Will print date with next month
        // g.roll(Calendar.MONTH, 2);   // --> Adds 2 months in date
        // g.roll(Calendar.YEAR, 2);
        System.out.println(g.getTime());
    }
}
