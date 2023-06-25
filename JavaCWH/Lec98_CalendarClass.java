package JavaCWH;

import java.util.Calendar;
import java.util.TimeZone;

public class Lec98_CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());  // --> Returns gregory
        System.out.println(c.getTimeZone());    
        System.out.println(c.getTimeZone().getID());  // --> Asia/Calcutta

        
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType());  // --> Returns gregory
        System.out.println(c1.getTimeZone()); 

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));

        // add() method - It is used to add or subtract the specified amount of time to the given calendar field, based on the calendar's rules.
        //c.add(Calendar.YEAR, 2);
        //System.out.println("Year after 2 years is: "+c.get(Calendar.YEAR));
        //c.add(Calendar.YEAR, -5);  // --> Subtracting 5 years after adding 2 years will give us 3 years due to previous addition.
        //System.out.println("Year before 5 years is: "+c.get(Calendar.YEAR));
        c.add(Calendar.MONTH, 2);
        System.out.println("Month after 2 months is: "+c.get(Calendar.MONTH));
        System.out.println("Time after 2 months is: "+c.getTime());

        System.out.println(c.getWeeksInWeekYear());

        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));
    }   
}

/* Calendar class in Java -
It is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.
Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
We use the static method Calender.getInstance() in order to implement a sub-class. */
