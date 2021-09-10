package com.example.testpfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class TestpfeApplication {
    public static ConfigurableApplicationContext ctx;
    public static void main(String[] args) {
        ctx= SpringApplication.run(TestpfeApplication.class, args);

    }



}
