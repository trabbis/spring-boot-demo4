package com.example.demo.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class HelloWorldController {

	@GetMapping(value="/hello")
	public ResponseEntity<Employee> HelloWord() {
		Employee emp = new Employee();
		
		emp.setEmpId("123");
		emp.setName("Duksun");
		emp.setSalary(3000d);
		emp.setDesignation("Programmer7");
		
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.set(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
//		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
	    
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}
