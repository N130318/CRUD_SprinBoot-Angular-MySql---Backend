package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ipl") //localhost:8080/ipl
public class Controller {
	
	@RequestMapping(value="/getMessage", method = RequestMethod.GET)
	public String getMessage() {
		return "Hello All, I am working";
	}

}
