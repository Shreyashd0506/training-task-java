package org.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Bean
        Car car = context.getBean(Car.class);

        car.drive();
    }
}

