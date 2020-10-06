package com.cosmos.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "Category001")
public class Category {
	@Id
	private String categoryName;
	@OneToMany(mappedBy = "category" , cascade = CascadeType.ALL,orphanRemoval = false)
	@JsonManagedReference
	private Set<Topic> topics;
	
	public Category() {
		super();
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Set<Topic> getTopics() {
		return topics;
	}
	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}
	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", topics=" + topics + "]";
	}

}
