package chapter2;

class Animal {
	void Walk() {
		System.out.println("walk");
	
	}
}

class Dog extends Animal{

	void Bark() {
		System.out.println("Bark ");

	}
}


class Cat extends Animal{

	void Eat() {
		System.out.println("Eat ");

	}
}

public class MutlipleInheritenceDemo {
	public static void main(String args[]) {
		Dog dog = new Dog();
		 dog.Bark();
		
	}

}
