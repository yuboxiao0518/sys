package com.primeton.sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/")
public class ServerController {
	@GetMapping("msg")
	public String msg() {
		return "this is sys' msg";
	}
}
