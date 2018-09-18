package com.minji.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minji.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {
	
}
