package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ImportResource("classpath:beans.xml")
public class Main implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Autowired private Pojo pojo;

    @Autowired
    private Student student;

    @Autowired
    private Student student1;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    public void run(String... args) {
        logger.info(pojo.getField());
        student.cheating();
        System.out.println("student : " +student);
        System.out.println("student1 : " +student1);
    }
}
