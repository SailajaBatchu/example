package com.cg.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.project")
public class PlpProject44Application {

	public static void main(String[] args) {
		SpringApplication.run(PlpProject44Application.class, args);
	}
}
