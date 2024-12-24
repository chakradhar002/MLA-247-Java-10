package chapter5;

import java.util.Arrays;
import java.util.List;

public class LambdaFunctionDemo {

	public static void main(String[] args) {
	
		List<Integer> f  = Arrays.asList(1,2,3,4,5,6,7,8,9);
     f.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
}}
