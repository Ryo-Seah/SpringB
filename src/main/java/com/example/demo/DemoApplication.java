package com.example.demo;

import java.time.Month;
import com.example.demo.student.*;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
			new Student(
				1L,
			    "Mariam", 
				"mariam@gmail.com",
				23,
				LocalDate.of(2000, Month.JANUARY, 5)
			)
		);
	}

}
