package com.dbs.twitterdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.twitterdemo.model.User;
import com.dbs.twitterdemo.repository.UserRepository;




@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public User saveUser(User user) 
	{
		return this.userRepository.save(user);
	}

	@Override
	@Transactional
	public List<User> listAll() {
		return this.userRepository.findAll();
	}

	@Override
	@Transactional
	public User findById(long UserId) {
		return this.userRepository.findById(UserId).get();
	}

	@Override
	@Transactional
	public void deleteEmployee(long UserId)
	{
        this.userRepository.delete(this.userRepository.findById(UserId).get());
		
	}

}
