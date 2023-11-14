package com.example.form.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.form.user.User;

public interface UserRepository extends MongoRepository<User, String>
{
	// User findByUsername(String username);
}
