package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopioController {
		@RequestMapping("/topics")
	public String AllTopics() {
		return "All Topics";
	}
	
}
