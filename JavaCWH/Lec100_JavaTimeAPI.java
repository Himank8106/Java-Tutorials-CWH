package JavaCWH;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lec100_JavaTimeAPI {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);   // --> 22:35:25.713656200 (prints in nano seconds)

        // System.out.println(l.plusDays(2));   // --> Adds 2 days in date  

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt); // --> 2021-08-18T22:35:25.713656200 (prints in nano seconds)

        Clock cl = Clock.systemUTC();
        System.out.println(cl.instant());

        // boolean isNegative() : This method is used to check if the duration is negative.
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00' 
        System.out.println(d1.isNegative());  // --> false
        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX = '23:59:59.999999999'
        System.out.println(d2.isNegative());  // --> true
    }
}
