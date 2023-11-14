
package com.example.form.controller;

import org.springframework.beans.factory   .annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.repo.UserRepository;
import com.example.form.user.User;

@Controller

@RequestMapping("/register")
public class RegistrationController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public String registerForm() {
		return "register";
	}

	@PostMapping 
	public String registerUser(User user) {
  userRepository.save(user); 
  return "redirect:/login"; 
  
}
}
