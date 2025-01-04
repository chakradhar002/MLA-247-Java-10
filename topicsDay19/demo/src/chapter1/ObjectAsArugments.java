package chapter1;

class Person {
	Person() {
	}// without parameterized constructor

	String name;
	int age;

	// constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void Greeting(Person p) {
		System.out.println("name" + p.name);
		System.out.println("name" + p.age);

	}

}

public class ObjectAsArugments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person k = new Person("ram", 34);
		k.Greeting(k);

	}

}
