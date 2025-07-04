package com.mydating.dating.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mydating.dating.dao.UserDao;
import com.mydating.dating.entity.User;
//import com.mydating.dating.util.UserGender;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public ResponseEntity<?> saveUser(User user) {
		User savedUser = userDao.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}

////	public ResponseEntity<?> findAllMaleUsers() {
////		List<User> maleUsers = userDao.findAllMaleUsers();
//		
//		
//		return null;
//	}

	public ResponseEntity<?> searchByName(String letters) {
	
		
		List<User> users = userDao.searchByName("%"+letters+"&");
		
		
		if(users.isEmpty())
		{
		
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No User Found With letters")
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(users)
		}
			
			
			
			
			
			
			
			
		return null;
	}


	
}
