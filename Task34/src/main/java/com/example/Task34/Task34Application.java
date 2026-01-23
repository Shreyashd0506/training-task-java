package com.example.Task34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Task34Application {

	public static void main(String[] args) {
		SpringApplication.run(Task34Application.class, args);
	}

}
