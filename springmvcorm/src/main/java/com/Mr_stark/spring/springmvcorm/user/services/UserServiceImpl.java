package com.Mr_stark.spring.springmvcorm.user.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mr_stark.spring.springmvcorm.user.dao.UserDao;
import com.Mr_stark.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		//Business logic
		return dao.create(user);
	}
}
