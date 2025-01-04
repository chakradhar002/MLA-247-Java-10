package chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDEmo {
//finding even or oadd number
	public static void main(String[] args) {
	//declare list in collections 

		
 List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
 List<Integer> resultevennumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());


 for(Integer evennumber:resultevennumbers) {
	 System.out.println(evennumber);
	 
 }
	}

	
	
}
