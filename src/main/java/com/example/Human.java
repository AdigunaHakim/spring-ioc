package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
public class Human {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Human.class, args);
        Body humanBody = context.getBean("humanBody", Body.class);
        humanBody.living();
    }
}
