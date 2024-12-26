
package chapter6;
/*
 * 
 * Key Features of   Vector
Dynamic Resizing:

Automatically resizes itself when more space is needed.
By default, it doubles its size when the current capacity is exceeded.
Thread-Safe:

All methods in Vector are synchronized, making it safe for multi-threaded environments.
Implements List Interface:

Like ArrayList, it provides random access to elements using an index.
Legacy Class:

Though functional, Vector is considered less efficient and is replaced in modern applications by ArrayList or CopyOnWriteArrayList.
*/
 import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Print the Vector
        System.out.println("Vector: " + vector);

        // Access an element by index
        System.out.println("Element at index 1: " + vector.get(1));

        // Add an element at a specific position
        vector.add(1, "Blueberry");
        System.out.println("After adding Blueberry: " + vector);

        // Remove an element
        vector.remove("Cherry");
        System.out.println("After removing Cherry: " + vector);

 
    }
}
