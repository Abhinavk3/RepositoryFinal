package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.DAOUser;

@Repository
public interface UserDao extends MongoRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}