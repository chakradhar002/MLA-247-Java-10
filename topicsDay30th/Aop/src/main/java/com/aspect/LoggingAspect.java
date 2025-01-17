package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.service.MyService.performTask(..))")
    public void logBeforeTask() {
        System.out.println("Logging before executing the task.");
    }
}
