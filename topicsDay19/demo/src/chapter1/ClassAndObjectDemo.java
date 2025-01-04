package chapter1;

class SumDemo {
	// method for sum of two number
 void DoSumOfTwoNumberCalculation() {
		int number1 = 10;
		int number2 = 20;
		int result = number1 + number2;
		System.out.println(result);
	}
}

// client class
public class ClassAndObjectDemo {
	public static void main(String args[]) {
		// Object declaration
		SumDemo result = new SumDemo();
		//calling logic from here
		result.DoSumOfTwoNumberCalculation();

	}

}
