package com.dbs.twitterdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.twitterdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
