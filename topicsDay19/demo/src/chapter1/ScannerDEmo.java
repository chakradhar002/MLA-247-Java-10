package chapter1;

import java.util.Scanner;

public class ScannerDEmo {
	public static void main(String[] args) {
		//  message
		System.out.println("Enter two number of your choice");
		//read from the keyboard
		Scanner scan = new Scanner(System.in);
		// first variable
		int FirstNumber = scan.nextInt();
		
		// second variable
		int SecondNumber = scan.nextInt();
		//result will stored in vairable  resu
		int result = FirstNumber + SecondNumber;
		System.out.println(result);

	}

}
