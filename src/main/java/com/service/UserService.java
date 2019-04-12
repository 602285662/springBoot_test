package com.service;

import org.springframework.context.annotation.Bean;

import com.bean.User;

public interface UserService {
	@Bean
	User findUserById(String string);
}
