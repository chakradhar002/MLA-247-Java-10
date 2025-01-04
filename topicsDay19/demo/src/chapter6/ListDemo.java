package chapter6;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		List<String> fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("orange");
	
		for(String myfruits:fruits) {
			
			System.out.println(myfruits);
		}
		
	}

}
