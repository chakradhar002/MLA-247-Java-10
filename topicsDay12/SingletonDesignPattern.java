package chapter4;

/*
 * The Singleton design pattern ensures that
 *  a class has only one instance and 
 *  provides a global point of access
 *   to that instance. It's commonly 
 *   used for managing shared resources,
 *    such as database connections 
 *    or configuration settings.*/
 

class Singleton {

	// static variable to hold the single instance

	private static Singleton singleinstance;

	// private constructor
	private Singleton() {
	}

	// public constructor to provide access to the instance
	public static Singleton getInstance() {

		if (singleinstance == null) {

			singleinstance = new Singleton();
		}
		return singleinstance;

	}

}

public class SingletonDesignPattern {

	public static void main(String[] args) {

		Singleton instanceresult = Singleton.getInstance();
		System.out.println(instanceresult);

		Singleton instanceresult1 = Singleton.getInstance();
		System.out.println(instanceresult1);
	}

}
