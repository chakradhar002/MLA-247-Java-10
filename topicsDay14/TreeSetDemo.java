package chapter6;

/* 
 * Key Features of TreeSet
Sorted Order:

Maintains the natural order of elements (ascending by default).
Alternatively, you can provide a custom comparator for a specific order.
Unique Elements:

Does not allow duplicate elements, as it implements the Set interface.
Implements NavigableSet:

Provides methods to navigate through elements, such as higher(), lower(), ceiling(), and floor().
Thread Safety:

Not thread-safe. Use Collections.synchronizedSet() for thread-safe operations.
Null Values:

Does not allow null elements, as it requires elements to be comparable.

 * */
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(25);

        // Print the TreeSet (sorted order)
        System.out.println("TreeSet: " + numbers);

        // Accessing the first and last elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        // Remove an element
        numbers.remove(25);
        System.out.println("After Removing 25: " + numbers);

        // Check for specific elements
        System.out.println("Contains 20? " + numbers.contains(20));

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Navigating using methods
        System.out.println("Higher than 20: " + numbers.higher(20));
        System.out.println("Lower than 20: " + numbers.lower(20));
    }
}
