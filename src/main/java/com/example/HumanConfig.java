package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class HumanConfig {

    @Bean
    public Brain humanBrain(){
        Brain humanBrain = new Brain();
        humanBrain.setNoOfBrain(1);

        return humanBrain;
    }
}
