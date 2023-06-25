package JavaCWH;
import java.util.Hashtable;

public class Lec94_Hashing {
    public static void main(String args[])
    {
        // Create a HashTable to store
        // String values corresponding to integer keys
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
 
        // Input the values
        hm.put(1, "Geeks");
        hm.put(12, "forGeeks");
        hm.put(15, "A computer");
        hm.put(3, "Portal");
        /* hm.add() is not a method in Hashtable class. It is a method in HashSet class. 
        You have to use put() method in Hashtable class. */
 
        // Printing the Hashtable
        System.out.println(hm);
    }
}

/*
Hashing in Java :-
Hashing is the technique to convert the range of key-value pairs to a range of indices. In hashing, we use hash functions to map keys to some values. These values are then used as an index to store the keys corresponding values. */

/* This are the 10 classes that implements Map interface in Java :-
1. HashTable
2. HashMap
3. LinkedHashMap
4. TreeMap
5. WeakHashMap
6. IdentityHashMap
7. EnumMap
8. ConcurrentHashMap
9. ConcurrentSkipListMap
10. Properties
*/

/* ChatGPT :- 
Hashtable does not guarantee the order of its elements when it is printed or iterated through. The order of elements in the output may vary based on the implementation details and hashing algorithm used by the Hashtable.

In the given code, the elements are inserted in a particular order (1, 12, 15, 3), but the output may not preserve that order. The order of the elements in the output depends on various factors such as the internal implementation of the Hashtable, the hash codes of the keys, and the collision resolution mechanism used.

So, it is important to note that while the key-value pairs are stored in the Hashtable, the order of the elements in the output may not necessarily match the insertion order.

--> Github copilot :-
Output: {15=A computer, 12=forGeeks, 3=Portal, 1=Geeks} or {1=Geeks, 12=forGeeks, 15=A computer, 3=Portal} or {15=A computer, 3=Portal, 12=forGeeks, 1=Geeks} because HashTable doesn't maintain any order. */
