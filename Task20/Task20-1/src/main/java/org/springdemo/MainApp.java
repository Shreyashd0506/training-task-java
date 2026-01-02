package org.springdemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Bean
        StudentService service = context.getBean(StudentService.class);
        service.displayStudent();

        College college = context.getBean(College.class);
        college.showCollege();

        context.close();
    }
}