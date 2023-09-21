package com.springprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@Value("${environment}")
	String a;

	@GetMapping(value = "/getThis")
	public String getThis() {
		return "CURRENT ENVIRONMENT IS" + " " + a;
	}
}
