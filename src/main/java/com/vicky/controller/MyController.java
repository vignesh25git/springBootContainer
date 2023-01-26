package com.vicky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class MyController {
	
	@GetMapping("/{name}")
	public String homePage(@PathVariable("name") String name) {
		
		return "welcome to my Page " + name;
	}

}
