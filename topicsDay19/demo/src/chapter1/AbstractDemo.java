package chapter1;
/*An instance of an abstract class can not be created.
Constructors are allowed.
We can have an abstract class without any abstract method.
There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
We can define static methods in an abstract class
We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
If a class contains at least one abstract method then compulsory should declare a class as abstract 
If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method

*/
abstract class Student {
	// partial implementation defined
	abstract void Subjects();
	

	/// non abstract class
	void study() {

		System.out.println("studing...");
	}

}

class Satyam extends Student {
	@Override
	void Subjects() {
		// TODO Auto-generated method stub
	}

	void Study() {

	}

}

public class AbstractDemo {

}
