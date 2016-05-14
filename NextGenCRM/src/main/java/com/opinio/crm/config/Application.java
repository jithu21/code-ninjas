package com.opinio.crm.config;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.opinio.crm")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}