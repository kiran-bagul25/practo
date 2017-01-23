package io.kiran.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kiran.dto.Topic;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public List<Topic> getTopics()
	{
		return Arrays.asList(
				new Topic(1, "java", "IT"),
				new Topic(1, "Spring", "SpringWorld"),
				new Topic(1, "hibernate", "HibernateWorld")
				);
	}
}
