package chapter2;

class Employee {

	static void Study() {
		System.out.println("study");
	}

	void NotStudy() {
		System.out.println("not study");
	}

}

public class StaticDemo {

	public static void main(String[] args) {

		Employee t = null;
		Employee t1 = new Employee();
		Employee t2 = new Employee();

		t.Study();

		System.out.println(t1);
		System.out.println(t2);

	}

}
