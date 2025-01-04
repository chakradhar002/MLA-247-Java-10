package chapter1;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		
	String FirstNumber = args[0];	
	String SecondNumber = args[1];	
	  // converted from string to Integer
	int FirstNumberIn =Integer.parseInt(FirstNumber);
		
	  // converted from string to Integer
	int SecondNumberIn =Integer.parseInt(SecondNumber);
	
	// addin  two numbers
	int result  = FirstNumberIn + SecondNumberIn;
	
	System.out.println("sum of two numbers"+result);
		
	}

}
