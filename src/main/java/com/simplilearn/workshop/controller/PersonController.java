package com.simplilearn.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@RequestMapping("/getname")
	public String getName() {
		String secondLine = "<h2> second line change </h2>";
		String thirdLine = "<h3> Third line change</h3>";
		return " <h1> AWS Code Deploy </h1> <br/> Hello Parijat Singh <br/> "
				+ secondLine
		+ thirdLine;
	}

}
