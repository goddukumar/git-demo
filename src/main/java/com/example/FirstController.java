package com.example;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	public String getHelloMsg() {
		return "hello";
	}

}
