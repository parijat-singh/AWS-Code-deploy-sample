package com.simplilearn.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@RequestMapping("/getname")
	public String getName() {
		return " <h1> AWS Code Deploy </h1> <br/> Hello Parijat Singh <br/> <h2> second line change </h2>";
	}

}
