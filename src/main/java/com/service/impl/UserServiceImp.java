package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserMapper;
import com.service.UserService;

@Service
public class UserServiceImp implements UserService{
	private @Autowired UserMapper userMapper;

	public User findUserById(String id) {
		return userMapper.findUserById(id);
	}

}
