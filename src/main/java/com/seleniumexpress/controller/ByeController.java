package com.seleniumexpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

	@GetMapping("/bye")
	public String sayBye() {
		return "bte everyone!";
	}
}
