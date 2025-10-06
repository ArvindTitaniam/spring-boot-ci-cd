package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application entry point and a minimal REST controller.
 *
 * Starts the Spring Boot application and exposes a
 * simple HTTP GET endpoint at /test that returns plain text.
 */
@SpringBootApplication
@RestController
public class DemoApplication {

	/**
	 * Bootstraps the Spring application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	/**
	 * Liveness-style endpoint for quick verification.
	 *
	 * @return the constant string "test" as the response body
	 */
	@GetMapping("/test")
	public String test(){
		return "test";
	}
}
