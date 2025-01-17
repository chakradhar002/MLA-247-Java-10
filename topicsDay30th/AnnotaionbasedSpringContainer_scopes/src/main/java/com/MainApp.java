package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// HelloWorld obj1 = new HelloWorld()
		HelloWorld obj1 = context.getBean(HelloWorld.class);

		HelloWorld obj2 = context.getBean(HelloWorld.class);
		
		if (obj1 == obj2) {

			System.out.println("the are equal" + (obj1 == obj2));
		} else {
			System.out.println("the are equal" + (obj1 == obj2));
		}
	}
}
