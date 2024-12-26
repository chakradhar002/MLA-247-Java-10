package chapter6;

import java.util.HashMap;
import java.util.Map;
/*
Key Features of HashMap
1.	Key-Value Pair Storage:
o	Each entry in a HashMap is stored as a key-value pair.
o	Keys must be unique, but values can be duplicated.
2.	No Order Guarantee:
o	Does not maintain the order of elements.
3.	Allows Null Keys and Values:
o	Allows one null key and multiple null values.
4.	Not Thread-Safe:
o	By default, it is not synchronized. Use Collections.synchronizedMap() or ConcurrentHashMap for thread safety.
5.	Efficient Operations:
o	Provides average O(1) time complexity for basic operations like put() and get().

*/

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> mapdemo = new HashMap<Integer,String>();
		
		mapdemo.put(1, "ram");
		mapdemo.put(2, "sham");
		mapdemo.put(3, "tom");
		mapdemo.put(4, "ravi");
	////// Access a value by keySystem.out.println(mapdemo);	
	
		// Iterate through the HashMap/// Remove a key-value pair	// Check if a key exists
		 // Replace a value
	}

}
