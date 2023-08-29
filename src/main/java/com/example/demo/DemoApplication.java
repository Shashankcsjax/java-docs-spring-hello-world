package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.joda.time.DateTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        // Create a new DateTime instance
        DateTime currentDateTime = new DateTime();

        // Print the current date and time
        System.out.println("Current Date and Time: " + currentDateTime);
	}
}
