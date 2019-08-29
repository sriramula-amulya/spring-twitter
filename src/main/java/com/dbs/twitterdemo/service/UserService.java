package com.dbs.twitterdemo.service;

import java.util.List;

import com.dbs.twitterdemo.model.User;





public interface UserService
{
	 User saveUser(User user);

	    List<User> listAll();

	    User findById(long UserId);

	    void deleteEmployee(long UserId);

}
