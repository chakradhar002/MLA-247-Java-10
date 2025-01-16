package com;

public class HelloWorld {
	
	
	public HelloWorld(String message) {
		this.message = message;
	}

	private String message;
	
	
	

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}
	
	public void show() {
		
		System.out.println(" from show"+message);
	}
}
