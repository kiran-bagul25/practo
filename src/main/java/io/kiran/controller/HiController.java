package io.kiran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@RequestMapping("/hellow")
	public String sayHiworld()
	{
		return "hi kiran";
	}
}
