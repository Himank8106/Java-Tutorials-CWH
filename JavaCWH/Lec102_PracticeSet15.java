package JavaCWH;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lec102_PracticeSet15 {
    public static void main(String[] args) {
        // Question - 1
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");   
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        for(String e: arr){
            System.out.println(e);
        }

        // Question - 2
        Date d1 = new Date();
        System.out.println(d1.getHours() + ":" + d1.getMinutes() + ":" + d1.getSeconds());

        // Question - 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // Question - 4
        // LocalDateTime dt = LocalDateTime.now();
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        // System.out.println(dt.format(dtf));

        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

        // Question - 5
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(1);   // --> Will not be added as it is already present in the set.
        System.out.println(h);
    }
}
