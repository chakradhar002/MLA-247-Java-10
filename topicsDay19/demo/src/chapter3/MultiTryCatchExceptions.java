package chapter3;

public class MultiTryCatchExceptions {

	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 8;
			int c = a / b;
			System.out.println(c);

			try {
				int i[] = { 1, 3, 4, 5 };

				i[4] = 67;

				System.out.println(i);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("your message");
			} // inner catch

		} catch (ArithmeticException e) {

			System.out.println("Pls dont divide by zero");

		} // catch outer

	}

}
