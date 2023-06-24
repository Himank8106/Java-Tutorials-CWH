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

/* ArrayList - It is a class in java.util package which implements the List interface.
It is a dynamic array. It maintains the insertion order of the elements. It is non-synchronized. It allows random access because array works at the index basis. In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
It is better to use ArrayList in Java if your frequent operation is retrieval operation because it is faster than LinkedList. */

/* Difference between ArrayList and LinkedList:
1. ArrayList internally uses a dynamic array to store the elements. LinkedList internally uses a doubly linked list to store the elements.
2. Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory. Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3. An ArrayList class can act as a list only because it implements List only. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4. ArrayList is better for storing and accessing data. LinkedList is better for manipulating data. */
