package chapter1;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		
	    if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }
		
		System.out.println("enter two numbres");

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		System.out.println(n1 + "" + n2);

	}

}
