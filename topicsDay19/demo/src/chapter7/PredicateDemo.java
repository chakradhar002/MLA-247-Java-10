package chapter7;

import java.util.function.Predicate;

/*
 *  Predicate
Definition: Represents a boolean-valued function of one argument.
Method: boolean test(T t)
Use Case: Often used for filtering or matching.
 * */

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEven = n -> n % 2 == 0;

		System.out.println(isEven.test(4));
	}

}
