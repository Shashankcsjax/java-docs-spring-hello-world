package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;
import org.joda.time.DateTime;

@SpringBootApplication 
@RestController
public class DemoApplication extends SpringBootServletInitializer {
	@GetMapping("/calculate-age")
	public String calculateAge(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate birthdate) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        
        return "Age: " + age.getYears();
	}
}
