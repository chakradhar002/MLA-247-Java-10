package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
 *  For example, it may be rollno, name, age or anything else.
 * compareTo(Object obj) method
public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns

positive integer, if the current object is greater than the specified object.
negative integer, if the current object is less than the specified object.
zero, if the current object is equal to the specified object.
 **/

class Student implements Comparable<Student> {

	public Student(int id, String name, int marks) {

		this.id = id;
		this.name = name;
		this.currentstudentmarks = currentstudentmarks;
	}

	private int id;
	private String name;
	private int currentstudentmarks;

	//

	@Override
	public int compareTo(Student other) {

		if (currentstudentmarks == other.currentstudentmarks) {

			return 0;

		} else if (currentstudentmarks > other.currentstudentmarks) {

			return 1;
		} else if (currentstudentmarks < other.currentstudentmarks) {

			return -1;
		}
		return id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return currentstudentmarks;
	}

	public void setMarks(int marks) {
		this.currentstudentmarks = currentstudentmarks;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "', marks=" + currentstudentmarks + "}";
	}

}

public class ComparableDemo {

	public static void main(String args[]) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "ram", 87));
		students.add(new Student(2, "sham", 45));
		students.add(new Student(3, "tom", 34));

		// printing before sorting

		for (Student names : students) {

			System.out.println(names);
		}

		// sort the students using collections.sort

		Collections.sort(students);

		// printing after sorting

		for (Student names : students) {

			System.out.println(names);
		}
	}

}