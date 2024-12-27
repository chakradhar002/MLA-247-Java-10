package chapter7;

import java.util.Arrays;
import java.util.List;

public class IntermediateDemo {
       //kepp only even numbers
	//multiply by 2
	//remove duplicaers
	//sort the number
	//print the result
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,3,4,3,2,9);
		numbers.stream().filter(n->n%2==0)
		.map(n->n*2)
		.distinct()
		.sorted().forEach(System.out::println);
	
	}

}
