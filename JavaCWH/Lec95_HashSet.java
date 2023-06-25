package JavaCWH;

import java.util.HashSet;

public class Lec95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();

        h1.add(6);
        h1.add(11);
        h1.add(9);
        h1.add(50);
        h1.add(11);

        System.out.println(h1);
    }
}

// Output: [50, 6, 9, 11] or [6, 9, 11, 50]... because HashSet doesn't maintain any order.

/* HashSet - 
It represents the collection that uses a hash table for storage. It contains unique elements only.
It is the best approach for search operations. It implements the set interface.
Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
The HashSet class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls. 

Load Factor - It is a measure that decides when to increase the HashMap capacity to maintain the get() and put() 
operation complexity of O(1).
*/