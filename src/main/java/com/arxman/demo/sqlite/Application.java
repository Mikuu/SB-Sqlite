package com.arxman.demo.sqlite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.arxman.demo.sqlite")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}