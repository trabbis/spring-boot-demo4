package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Changes;
import com.example.demo.model.Employee;
import com.example.demo.service.CoinsService;

@RestController
public class HelloWorldController {

	@Autowired
	private CoinsService service;
	
	@GetMapping(value="/coins/{bill}")
	public ResponseEntity<Changes> changeRequest(@PathVariable Integer bill) throws Exception {
		Employee emp = new Employee();
		
		emp.setEmpId("1");
		emp.setName("emp1");
		emp.setSalary(3000d);
		emp.setDesignation("manager");
		
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.set(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
//		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		
		Changes changes = service.checkingAvailableConins(bill);
//		System.out.println(changes);
		
		return new ResponseEntity<>(changes, HttpStatus.OK);
	}
}
