package chapter6;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> city = new 	LinkedList<String>();
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
