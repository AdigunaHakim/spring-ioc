package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ImportResource("classpath:beans.xml")
public class Human {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Human.class, args);
        Body humanBody = context.getBean("humanBody", Body.class);
        humanBody.living();
    }
}
