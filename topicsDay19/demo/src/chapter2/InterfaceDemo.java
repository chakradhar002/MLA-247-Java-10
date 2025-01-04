package chapter2;

interface Company {

	void Hr();

	void Employee();

}

class Emphasis implements Company {

	@Override
	public void Hr() {
		System.out.println("Emphasis one hr");

	}

	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		System.out.println("1000 empployee");

	}

	class TCS implements Company {

		@Override
		public void Hr() {
			// TODO Auto-generated method stub
			System.out.println("TCS 5 HR");
		}

		@Override
		public void Employee() {
			// TODO Auto-generated method stub
			System.out.println("20000 employess");
		}

	}

}

public class InterfaceDemo {

	public static void main(String ar[]) {

	}

}
