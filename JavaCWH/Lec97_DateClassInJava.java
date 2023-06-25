package JavaCWH;

import java.util.*;

public class Lec97_DateClassInJava {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);  // --> Prints current date and time.

        Date d1 = new Date(1687718708696l);
        System.out.println(d1);
        // It will print the specific date and time after 1687718708696 milliseconds from 1 January, 1970.
        // Output: Mon Jun 26 00:15:08 IST 2023

        Date d2 = new Date(2020, 1, 20);
        System.out.println(d2.compareTo(d));
        /* compareTo() compares two dates for ordering. Checks for the equality of the two dates.
        Returns -1 if the date is less than the date argument, 0 if the date is equal to the date argument, 
        and 1 if the date is greater than the date argument. */

        System.out.println(d.getTime());
        // getTime() returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.

        System.out.println(d.getDate());
        System.out.println(d.getDay());
        // getDate() returns the day of the month represented by this date. The value returned is between 1 and 31 representing the day of the month that contains or begins with the instant in time represented by this Date object, as interpreted in the local time zone.

        System.out.println(d.getYear());
        // getYear() returns the year represented by this date, minus 1900. (123 for 2023)
    }
}

/* Date class in Java -  (deprecated) --> Use Calendar class instead.
It represents the specific instant of time, with millisecond precision.
It is a wrapper around a millisecond value that allows Java to identify instants in time. */
