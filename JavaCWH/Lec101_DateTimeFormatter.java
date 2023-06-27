package JavaCWH;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lec101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");        
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_TIME;   // --> Prints time in ISO format. (Predefined format)
        // Refer docs for more predefined formats.


        String s = dt.format(dtf);
        System.out.println(s);

        String s1 = dt.format(dtf1);
        System.out.println(s1);
        
        String s2 = dt.format(dtf2);
        System.out.println(s2);
    }
}

/*
// This is the list of all the symbols that can be used to create a custom date and time format string:
Symbols   Meaning                 Presentation        Examples
G         era designator          (Text)              AD
y         year                    (Number)            1996
M         month in year           (Text & Number)     July & 07
d         day in month            (Number)            10
h         hour in am/pm (1~12)    (Number)            12
H         hour in day (0~23)      (Number)            0
m         minute in hour          (Number)            30
s         second in minute        (Number)            55
S         millisecond             (Number)            978
E         day in week             (Text)              Tuesday
D         day in year             (Number)            189
F         day of week in month    (Number)            2 (2nd Wed in July)
w         week in year            (Number)            27
W         week in month           (Number)            2
a         am/pm marker            (Text)              PM
k         hour in day (1~24)      (Number)            24
K         hour in am/pm (0~11)    (Number)            0
z         time zone               (Text)              Pacific Standard Time
'         escape for text         (Delimiter)         'Date='
''        single quote            (Literal)           'o''clock'
 */