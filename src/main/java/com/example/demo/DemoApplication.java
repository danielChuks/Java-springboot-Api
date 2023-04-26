package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> apiRoot() {
		return List.of(
				new Student(
						1L,
						"Daniel",
						"daniel@gmail.com",
						LocalDate.of(2000, Month.APRIL, 14),
						21
				),
				new Student(
						2L,
						"Victor",
						"Victor@gmail.com",
						LocalDate.of(1996, Month.DECEMBER, 14),
						21
				)
		);
	}
}
