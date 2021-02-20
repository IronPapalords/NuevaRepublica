package com.ironpapalords.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtValidatorController {

	@RequestMapping({ "/validate" })
	public ResponseEntity<?> validate() {
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}

}