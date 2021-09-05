package com.example.testpfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TestpfeApplication {

    public static ConfigurableApplicationContext ctx;
    public static void main(String[] args) {
        ctx= SpringApplication.run(TestpfeApplication.class, args);

    }

    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

}
