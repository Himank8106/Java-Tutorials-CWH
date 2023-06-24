package JavaCWH;
import java.util.LinkedList;

public class Lec92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);

        // This two methods are not available in arraylist
        l1.addLast(676);     // --> This will add 676 at the end of the arraylist
        l1.addFirst(788);    // --> This will add 788 at the start of the arraylist

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}

/* LinkedList - It is a class in java.util package which implements the List interface. 
It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach to a node we wish to access. It uses a doubly linked list internally to store the elements. */


/* Difference between ArrayList and LinkedList:
1. ArrayList internally uses a dynamic array to store the elements. LinkedList internally uses a doubly linked list to store the elements.
2. Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory. Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3. An ArrayList class can act as a list only because it implements List only. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4. ArrayList is better for storing and accessing data. LinkedList is better for manipulating data. */