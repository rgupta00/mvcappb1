package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//it is not to explain you anyting about spring of ...
@RestController
public class Hello {
	
	@GetMapping(path = "hello")
	public String hello() {
		return "hello to all";
	}

}
