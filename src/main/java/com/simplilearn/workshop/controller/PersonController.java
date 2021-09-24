package com.simplilearn.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@RequestMapping("/getName")
	public String getName() {
		return "Hello Parijat";
	}

}
