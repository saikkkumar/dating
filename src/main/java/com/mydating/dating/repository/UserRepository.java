package com.mydating.dating.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mydating.dating.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select u from user u where u.name like ?1")
	List<User> searchByName(String letters);

	
	
	
	

}
