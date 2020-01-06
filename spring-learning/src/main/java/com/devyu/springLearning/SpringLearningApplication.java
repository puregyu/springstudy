package com.devyu.springLearning;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devyu.springLearning.controller.UserService;

public class SpringLearningApplication {

	public static void main(String[] args) {
		
	// xml의 설정을 통한 bean 등록 테스트
//	ApplicationContext xmlContext = new ClassPathXmlApplicationContext("application.xml");
//	System.out.println(Arrays.toString(xmlContext.getBeanDefinitionNames()));
//	
//	UserService userService = (UserService)xmlContext.getBean("userService");
//	System.out.println(userService.userRepository != null);
	
	// java config의 설정을 통한 bean 등록 테스트
	ApplicationContext JavaConfigContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	System.out.println(Arrays.toString(JavaConfigContext.getBeanDefinitionNames()));
	
	UserService userService = (UserService)JavaConfigContext.getBean("userService");
	System.out.println(userService.userRepository != null);
	
	}
}
