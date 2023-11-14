package com.example.day;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayApplication.class, args);
        SpringApplication.run(DayApplication.class, args);


    }
}