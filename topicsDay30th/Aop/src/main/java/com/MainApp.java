package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.service.MyService;



public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = context.getBean(MyService.class);
        myService.performTask();

        context.close();
    }
}
