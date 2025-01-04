package chapter1;

/**
 * Author Mantha Chakradhar
 */
class SumOfTwoNumbers {
	/** Logic for two numbers
	 * @return
	 */
	int AdditionToNumbers(int number1,int number2) {
		int result = number1 + number2;
		return result;

	}

}

public class MethodReturnTypeDemo {
		public static void main(String args[]) {
		SumOfTwoNumbers myresult = new SumOfTwoNumbers();
			
		int finalresult = myresult.AdditionToNumbers(20,30);
		System.out.println("--->"+finalresult);
			
	}

}
