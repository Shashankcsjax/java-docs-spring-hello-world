package com.example.demo;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {

    @GetMapping("/calculate-age")
    public String calculateAge(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate birthdate) {
        LocalDate currentDate = new LocalDate();
        Years age = Years.yearsBetween(birthdate, currentDate);
        
        return "Age: " + age.getYears();
    }
}
