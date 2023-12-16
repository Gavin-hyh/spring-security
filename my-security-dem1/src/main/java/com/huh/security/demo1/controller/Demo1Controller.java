package com.huh.security.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HouYiHeng 15/12/2023
 */
@RestController()
@RequestMapping("demo1")
public class Demo1Controller {

	@GetMapping("test1")
	public String test1(){
		return "test1";
	}
}
