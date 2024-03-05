package com.spring.implementation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.implementation.util.CustomException;

@RestController
@RequestMapping("/api")
public class CustomExceptionController {

	@GetMapping("/customException")
	public ResponseEntity<String> throwCustomException(){
		throw new CustomException("A Custom Exception occured in your Controller call");
	}
}
