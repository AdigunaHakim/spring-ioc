package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Human {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HumanConfig.class);
        Body humanBody = context.getBean("humanBody", Body.class);
        humanBody.living();
    }
}
