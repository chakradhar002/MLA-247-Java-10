package chapter3;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		try {
			int i[] = { 1, 3, 4, 5 };

			i[4] = 67;

			System.out.println(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("your message");
		}

		finally {

			System.out.println("finally closed");
		}

	}
}
