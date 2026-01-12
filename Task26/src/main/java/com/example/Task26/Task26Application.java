package com.example.Task26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Task26Application {

	public static void main(String[] args) {
		SpringApplication.run(Task26Application.class, args);
	}

}
