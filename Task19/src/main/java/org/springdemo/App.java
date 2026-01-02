package org.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Employee emp1 = (Employee) context.getBean("emp");
        emp1.display();

        Address address1 = (Address) context.getBean("address");
        address1.setCity("Berlin");

        emp1.setAddress(address1);
        emp1.display();

        context.close();
    }
}