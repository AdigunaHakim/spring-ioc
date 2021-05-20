package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@ImportResource("classpath:beans.xml")
public class Exam implements CommandLineRunner {
    @Autowired
    private Student student1;

    @Autowired
    private Student student2;

    public static void main(String[] args) {
        SpringApplication.run(Exam.class, args);
    }

    public void run(String... args) {
        System.out.println("Start Exam...");

        student2.setId(2);
        student2.setName("pirlo");

        student1.cheating();
        student2.cheating();
    }
}
