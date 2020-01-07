package com.devyu.springLearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserRepository userRepository;

	// 생성자를 통한 주입
//	@Autowired
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	
	// 세터를 통합 주입
//	public void setUserRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}

	
}
