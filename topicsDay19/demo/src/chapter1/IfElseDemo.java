package chapter1;

public class IfElseDemo {

	public static void main(String args[]) {

		String age = args[0];
		int ageforvote = Integer.parseInt(age);

		if (ageforvote >= 18) {
			System.out.println(" Eligible for vote");
		} else {
			System.out.println("not Eligible for vote");

		}

	}

}
