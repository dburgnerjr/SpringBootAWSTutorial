package com.danielburgnerjr.springbootawstutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String welcome() {
	  return "This is a test of the Spring Boot AWS Tutorial app.  This is only a test.";
	}
}
