package com.mydating.dating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydating.dating.entity.User;
import com.mydating.dating.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	
	
	
	@PostMapping("/users")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	
//	@GetMapping("/users/gender/male")
//	public ResponseEntity<?> findAllMaleUsers(){
//		return userService.findAllMaleUsers();
//	}
//	
//	
////	@GetMapping("/user/gender/female")
	
	
	
	@GetMapping("/users/search/name/{letters}")
	public ResponseEntity<?> searchByName(@PathVariable String letters){
		return userService.searchByName(letters)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
