package com.danielburgnerjr.springbootawstutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootawstutorialApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootawstutorialApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootawstutorialApplication.class, args);
	}
}
