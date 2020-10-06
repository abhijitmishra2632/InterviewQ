package com.cosmos.service;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosmos.model.Category;
import com.cosmos.model.Topic;
import com.cosmos.repository.TopicRepository;


@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	

	public Category getTopicByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		Category category = topicRepository.findById(categoryName).get();
		return category;
	}

	public String saveTopic(Category category) {
		// TODO Auto-generated method stub
		String str ="";
		try {
			category = topicRepository.save(category);
			str = category.getCategoryName()+" updated Successfully";
		}catch (Exception e) {
			str = "Some Error";
		}
		return str;
	}

	public String saveDummyTopic() {
		String str ="";
		Topic topic = new Topic();
		topic.setTopicName("Immutable");
		topic.setTopicImportance("High");
		
		Topic topic1 = new Topic();
		topic1.setTopicName("SCP");
		topic1.setTopicImportance("Medium");
		Set<Topic> topics = new LinkedHashSet<Topic>();
		topics.add(topic);
		topics.add(topic1);
		Category category = new Category();
		category.setCategoryName("String");
		topic.setCategory(category);
		topic1.setCategory(category);
		category.setTopics(topics);
		try {
			category = topicRepository.save(category);
			str = category.getCategoryName()+" updated Successfully";
		}catch (Exception e) {
			str = "Some Error";
		}
		return str;
	}

}
