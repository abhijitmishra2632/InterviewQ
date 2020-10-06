package com.cosmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.model.Category;

public interface TopicRepository extends JpaRepository<Category, String>{

}
