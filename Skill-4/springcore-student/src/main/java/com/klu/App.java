package com.klu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring IoC container from applicationContext.xml
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Student bean by ID
        Student student = (Student) context.getBean("student");

        // Call the display() method to show details
        student.display();
    }
}
