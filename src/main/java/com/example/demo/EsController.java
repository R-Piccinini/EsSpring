package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EsController {

	public EsController() {

	}

	@GetMapping("/test")
	public String test() {
		return "Test superato!";
	}

	@GetMapping("/test2")
	public String test2(@RequestParam String id) {
		switch (id) {
		case ("1"):
			return "Test 1";
		case ("2"):
			return "Test 2";
		case ("3"):
			return "Test 3";
		default:
			return "Specifica id";
		}	
	}
	
	@PostMapping("/test")
	public String test3(@RequestBody Map<String,Object> post) {
		
		return post.get("name")+" "+post.get("lastName")+" "+post.get("age");
	}
}
