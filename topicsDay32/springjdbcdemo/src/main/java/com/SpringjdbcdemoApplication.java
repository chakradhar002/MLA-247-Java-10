package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringjdbcdemoApplication {

	public static void main(String ar[]) {

		// Create the application context by reading Beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		StudentJDBCTemplete std = (StudentJDBCTemplete) context.getBean("studentJDBCTemplate");

		std.addStudentRecord("ram", 12);
		std.addStudentRecord("ram", 12);
		std.addStudentRecord("ram", 12);

		System.out.println("done");
	}

}
