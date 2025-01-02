package chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Serializable Interface:
 *  A marker interface that indicates 
 *  the class can be serialized.
ObjectOutputStream: Used to write objects to a file.
ObjectInputStream: Used to read objects from a file.
Example Code:*/
class Person implements Serializable {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

public class SerializationDemo {

	public static void serializeObject(Object obj, String filename) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(obj);
			System.out.println("Object has been serialized.");
		} catch (IOException e) {
			System.err.println("Error during serialization: ");
		}
	}

	public static Object deserializeObject(String filename) throws ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			System.out.println("Object has been deserialized.");
			return ois.readObject();
		} catch (IOException e) {
			System.err.println("Error during deserialization: " + e.getMessage());
			return null;
		}
	}

	

	public static void main(String[] args) throws ClassNotFoundException {
           String filename="myperson.txt";
		Person p = new Person("Ram", 30);
  // method serializeObject called
		serializeObject(p,filename);
	
// deserlization of the objefct
		
 Person  deserlization = (Person) deserializeObject(filename);
	
	    System.out.println(deserlization);
	}
}
