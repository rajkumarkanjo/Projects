package com.user.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
	@Query("select u from User u where u.username=:username")
	public User findByName(@Param(value = "username") String username);


}
