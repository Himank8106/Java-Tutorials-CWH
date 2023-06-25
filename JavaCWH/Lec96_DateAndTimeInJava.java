package JavaCWH;

public class Lec96_DateAndTimeInJava {
    public static void main(String[] args) {
        long l = Long.MAX_VALUE;
        System.out.println(l);

        long c = System.currentTimeMillis(); 
        // It returns the current time in milliseconds (or the number of milliseconds passed since midnight, January 1, 1970 UTC)
        System.out.println("The number of milliseconds passed since 1 January, 1970 are "+c);

        System.out.println(System.currentTimeMillis()/1000/3600/24/365); 
        // It returns the number of years passed since 1 January, 1970 (53 for 2023)
        
        System.out.println(l/c);
    }
}

// System.currentTimeMillis() --> It returns the current time in milliseconds. 
// The value is stored in long datatype.
//The unit of time of the return value is a millisecond, the granularity of the value depends on the underlying operating system and may be larger. For example, many operating systems measure time in units of tens of milliseconds.

/* Date and Time in Java -
Java provides the Date class available in java.util package, this class encapsulates the current date and time.
Date() --> It allocates a Date object and initializes it to represent the current date and time specified number of milliseconds since the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
They are deprecated. It is recommended to use Calendar class. */
