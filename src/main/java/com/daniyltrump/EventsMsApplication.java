package com.daniyltrump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@EnableAutoConfiguration
@SpringBootApplication
public class EventsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsMsApplication.class, args);
	}
}
