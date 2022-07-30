package com.Mr_stark.spring.springmvcorm.user.dao;

import java.util.List;

import com.Mr_stark.spring.springmvcorm.user.entity.User;

public interface UserDao {
	int create(User user);
	List<User> findUsers();
}
