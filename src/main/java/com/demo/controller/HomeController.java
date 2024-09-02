package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.Users;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class HomeController {

	@GetMapping("/users")
	public Map<String, String> getUser() {
		
		Map<String, String> key = new HashMap<>();
		key.put("Name: ","Suhail");
		key.put("Major: ", "BCA");
		key.put("Age: ", "21"); 
		System.out.println(key); 
		return key; 
	} 
	
	@GetMapping("/mark")
	public int getMark() {
		return 214;
	}

	@GetMapping("/add")
	public int addNumber(@RequestParam("a") int opt1, @RequestParam("b") int opt2) {
		return opt1 + opt2;
	} 
	
	@GetMapping("/sub")
	public int subNumber(@RequestParam("a") int opt1, @RequestParam("b") int opt2) {
		return opt1 - opt2;
	} 
	
	@GetMapping("/multi")
	public int multiNumber(@RequestParam("a") int opt1, @RequestParam("b") int opt2) {
		return opt1 * opt2;
	} 
	
	@GetMapping("/div")
	public int divNumber(@RequestParam("a") int opt1, @RequestParam("b") int opt2) {
		return opt1 / opt2;
	} 
	
	@GetMapping("/calc/{a}/{b}")
	public int calcNumber(@PathVariable("a") int opt1, @PathVariable("b") int opt2) {
		return opt1 + opt2; 
	}
	
	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		if(users.getUserName().equals("Suhail"))
		if(users.getEmail().equals("suhail@gmail.com"))
		if(users.getPassword().equals("ms1109")) {
			return "valid data";
		}
		return "invalid data";
		
	}
	
}
