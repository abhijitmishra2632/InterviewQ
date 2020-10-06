package com.cosmos.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Topic001")
public class Topic {
	@Id
	private String topicName;
	private String topicImportance;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoryName")
	@JsonBackReference
	private Category category;
	
	public Topic() {
		super();
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicImportance() {
		return topicImportance;
	}
	public void setTopicImportance(String topicImportance) {
		this.topicImportance = topicImportance;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Topic [topicName=" + topicName + ", topicImportance=" + topicImportance + ", category=" + category
				+ "]";
	}

}
