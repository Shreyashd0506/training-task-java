package org.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("Pune University")
    private String collegeName;

    public void showCollege() {
        System.out.println("College Name: " + collegeName);
    }
}
