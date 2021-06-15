package com.christian.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/human")
	public String helloHuman(@RequestParam(value="q", required=false) String name) {
		if(name == null) {
			return "Hello Human!";
		}
		else {
			return "Hello " + name;
		}
	}
}