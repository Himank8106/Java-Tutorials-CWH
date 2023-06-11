package JavaCWH;

public class Lec14_StringMethods {
    public static void main(String[] args) {
        String name = "Himank Joshi";
        //     "Himank Jos h i"
        //Index-01234567891011    Himank Joshi me 12 index hai 0 to 11

        int a = name.length();
        System.out.println(a);

        String b = name.toLowerCase();
        System.out.println(b);

        String c = name.toUpperCase();
        System.out.println(c);

        String d = "   Himank   Joshi   ";
        System.out.println(d.trim());
        //name1.trim() se leading aur trailing space hi trimmed out hoga na ki bich wale bhi
        //method 2:-
        String e = d.trim();
        System.out.println(e);

        System.out.println(name.substring(3));
        //it means index 3 se lekar jitne bhi index hai saare print ho jayenge

        System.out.println(name.substring(3,9));
        //it means index 3 se 8 tak ke strings print honge lekin 9th index print nhi hoga
        System.out.println(name.substring(3,12));
        //index 3 se 11 print honge bhale hi 12th index na ho lekin hum likh sakte hai
              /*
              System.out.println(name.substring(3,13));
              */
        //index hum total index + 1 hi maximum le sake hai jisse ki hum pura substring likh paye excluding last index
        //jo ki humne extra liya hai

        System.out.println(name.replace('H','T'));
        //naam me saare H ko T se replace kar dega
        System.out.println(name.replace("mank","tesh"));
        System.out.println(name.replace("i","HH"));

        System.out.println(name.startsWith("Him"));
        System.out.println(name.endsWith("nk"));
        System.out.println(name.endsWith("hi"));
        //Gives true or false as output

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(5));
        //Index 5 pe jo letter hai vo print ho jayega

        System.out.println(name.indexOf('H'));
        System.out.println(name.indexOf('i'));
        // 'i' index number 1 aur 11 dono par aa rha hai but first index number hi output me return hoga
        System.out.println(name.indexOf("man"));
        // 'm' ka index number show karega
        System.out.println(name.indexOf("Hi1m2"));
        // Agar nhi milega to output me -1 return karega

        System.out.println(name.indexOf("i",5));
        //It says index number 5 ke baad se 'i' ka index number search karo
        System.out.println(name.indexOf("ank",8));
        System.out.println(name.indexOf("Hi1m2",5));

        System.out.println(name.lastIndexOf('i'));
        //name.indexof('i') me L to R search karta hai but isme R to L search karega

        String f = "Himankmank";
        System.out.println(f.lastIndexOf("ank",5));
        System.out.println(f.lastIndexOf("ank",7));
        System.out.println(f.lastIndexOf("ank",15));
        //Because piche se search karna chalu karega

        System.out.println(name.equals("Himank"));
        System.out.println(name.equals("Himank Joshi"));

        System.out.println(name.equalsIgnoreCase("himANk joSHi"));
        //Ignores upper or lower case in string

        //Escape Sequence Characters
        System.out.println("Hi Himank \n How are you?"); // insert a newline
        System.out.println("Hi Himank \t How are you?"); // insert a tab
        System.out.println("Hi Himank \bHow are you?");  // insert a backspace
        System.out.println("Hi Himank \r How are you?"); // insert a carriage return
        System.out.println("Hi Himank \f How are you?"); // insert a form feed
        System.out.println("Hi Himank \' How are you?"); // insert a quote character
        System.out.println("Hi Himank \" How are you?"); // insert a double quote character
        System.out.println("Hi Himank \\ How are you?"); // insert a backslatsh

    }
}
