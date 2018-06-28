/**
 * @author Dario Mincioni
 */
package com.dariomincioni.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// annotation shows Spring Boot which main method to call when starting the application
@SpringBootApplication
public class RestApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(RestApiApp.class, args);

	}

}
