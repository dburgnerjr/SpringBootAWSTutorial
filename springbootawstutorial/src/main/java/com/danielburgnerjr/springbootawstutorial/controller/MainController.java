package com.danielburgnerjr.springbootawstutorial.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "This is a test of the Spring Boot AWS Tutorial app.  This is only a test.";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
}
