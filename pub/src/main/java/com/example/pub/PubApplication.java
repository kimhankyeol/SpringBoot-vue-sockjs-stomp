package com.example.pub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PubApplication {

    public static void main(String[] args) {
        SpringApplication.run(PubApplication.class, args);
    }

}
