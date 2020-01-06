package com.devyu.springLearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class UesrController {
	
	
	UserRepository userRepository;
	
	//UserRepository user = new UserRepository();
	
	
	public String Home() {
		return "";
	}
}
