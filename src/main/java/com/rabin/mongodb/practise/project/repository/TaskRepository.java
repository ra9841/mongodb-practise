package com.rabin.mongodb.practise.project.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rabin.mongodb.practise.project.entity.Task;

public interface TaskRepository extends MongoRepository<Task,Integer>{


	



}
