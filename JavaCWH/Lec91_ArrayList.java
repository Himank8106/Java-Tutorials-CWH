package JavaCWH;
import java.util.ArrayList;

public class Lec91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(15);
        l2.add(16);
        l2.add(17);

        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(0,9);   // --> This will add 9 on index 0
        l1.add(0, 2);  // --> Now 2 will be on index 0 and 9 will shift to index 1

        // l1.addAll(l2);         // --> This will add elements of l2 in l1
        l1.addAll(0, l2);   // --> This will add elements of l2 from index 0 in l1

        // l1.clear();   // --> This will clear array l1

        System.out.println(l1.contains(50));   // --> Returns true if element contains in the arraylist and false if not.
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(4));
        System.out.println(l1.lastIndexOf(555));   // --> Returns -1 if element is not in array
        System.out.println(l2.indexOf(17));   // --> Returns index no. of 17 in arraylist l2

        l1.set(1, 400);
        // Set method will set the value at given index to the given value i.e. 400 at index 1

        System.out.println(l1);
        System.out.println(l1.get(0));   // --> Returns value at index 0

        for(int i=0; i<l1.size(); i++){            // --> l1.length() will not work here, we have to use l1.size()
            System.out.println(l1.get(i));   // --> l1[i] will not work here, we have to use l1.get(i)
        }
    }
}
