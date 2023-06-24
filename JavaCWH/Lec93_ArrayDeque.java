package JavaCWH;

import java.util.ArrayDeque;

public class Lec93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        // ad1.addLast(7);
        // ad1.removeFirst();
        // ad1.removeLast();

        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}

/* ArrayDeque - It is a class in java.util package which implements the Deque interface.
It is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 
It is also known as Array Double Ended Queue or Array Deck. 
It is faster than ArrayList and Stack and has no capacity restrictions. 
It is a resizable array implementation of the Deque interface. */