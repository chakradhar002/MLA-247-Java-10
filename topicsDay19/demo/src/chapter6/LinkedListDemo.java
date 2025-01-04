package chapter6;
/* Overview of LinkedList
LinkedList is part of the java.util package.
It is a doubly linked list implementation of the List and Deque interfaces.
Elements are stored in nodes, where each node contains data and references to the next and previous nodes.
It allows constant-time insertions or deletions from the start or end but has linear-time complexity for access by index.
Advantages of LinkedList
Efficient Insertion/Deletion:
Adding/removing elements at the beginning or middle is efficient compared to ArrayList.
Implements Deque:
Can be used as a queue (addLast(), removeFirst()) or stack (addFirst(), removeFirst()).
Dynamic Size:
It grows or shrinks dynamically without the need for resizing.
Disadvantages of LinkedList
Slower Access:
Accessing elements by index is slower (O(n)) compared to ArrayList (O(1)).
Higher Memory Overhead:
Each node requires extra memory for pointers to the next and previous elements.
 */
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> city = new 	LinkedList<String>();
	city.add("india");  
	city.add("india");
       city.add("nepal");
       city.add("USA");
       city.add("RUSSIA");
       city.addFirst("Finland");
       // implement 
       //remove()
       //addLast
       //isempty()
       for(String mycities:city) {
    	   
    	System.out.println(mycities);   
       }
	}

}
