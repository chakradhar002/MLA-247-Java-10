package com;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorld {
	private String message = "Hello, Spring with Annotation!";

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	void show() {

		System.out.println("Your Message from show()");

	}

}
