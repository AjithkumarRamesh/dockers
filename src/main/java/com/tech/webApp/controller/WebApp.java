package com.tech.webApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {
	@GetMapping("getOne")
	public String get() {
		return "hi All";
	}

}
