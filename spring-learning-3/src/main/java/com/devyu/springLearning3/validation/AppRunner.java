//package com.devyu.springLearning3.validation;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.BeanPropertyBindingResult;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//@Component
//public class AppRunner implements ApplicationRunner {
//
//	@Autowired
//	ApplicationContext ctx;
//	
//	// springboot 2.0.5 이상. 자동 bean으로 등록됨
//	@Autowired
//	Validator validator;
//	
//	
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		
//		Event event = new Event();
////		EventValidator eventValidator = new EventValidator(); // 과거
//		Errors errors = new BeanPropertyBindingResult(event, "event");
//		
//	
////		eventValidator.validate(event, errors); // 과거
//		validator.validate(event, errors);
//		
//		System.out.println(errors.hasErrors());
//		errors.getAllErrors().forEach(e -> {
//			
//			System.out.println("======= error ======");
//			System.out.println(e.getCode());
//			
//		});
//		
//		
//		
//	}
//
//}