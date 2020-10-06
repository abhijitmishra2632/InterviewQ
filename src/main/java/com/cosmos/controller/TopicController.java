package com.cosmos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmos.model.Category;
import com.cosmos.service.TopicService;

@RestController
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	private TopicService topicService;
	@GetMapping("/{categoryName}")
	public Category getTopicByCategoryName(@PathVariable String categoryName) {
		return topicService.getTopicByCategoryName(categoryName);
	}
	@PostMapping
	public String saveTopic(@RequestBody Category category) {
		return topicService.saveTopic(category);
	}
	@PostMapping("/dummy")
	public String saveDummyTopic() {
		return topicService.saveDummyTopic();
	}

}
