package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the application context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bean
        HelloWorld obj =  context.getBean(HelloWorld.class);

        // Call the method
        obj.show();
    }
}
