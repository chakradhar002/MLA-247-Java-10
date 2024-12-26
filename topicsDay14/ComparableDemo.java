package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * compareTo(Object obj) method
public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns

positive integer, if the current object is greater than the specified object.
negative integer, if the current object is less than the specified object.
zero, if the current object is equal to the specified object.
 **/

class Student  implements Comparable <Student>{
	
	
	public Student(int id, String name, int marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	private int id;
	private String name;
	private int marks;
	
	//

	@Override
	public int compareTo(Student  other) {
		
		return Integer.compare(this.marks,other.marks);
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
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }	

}


public class ComparableDemo {
	
	public static void main(String args[]) {
		
		List<Student> students  = new ArrayList<Student>();
		
		students.add(new Student(1,"ram",87));
		students.add(new Student(2,"sham",45));
		students.add(new Student(3,"tom",34));
		
		
		//printing before sorting
		
		for(Student names : students) {
			
			System.out.println(names);
		}
		
		//sort the students using collections.sort
		
		Collections.sort(students);
		
	//printing after sorting
		
		for(Student names : students) {
			
			System.out.println(names);
		}
	}





}