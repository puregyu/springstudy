//package com.devyu.springLearning;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.devyu.springLearning.controller.UserRepository;
//import com.devyu.springLearning.controller.UserService;
//
///*@ComponentScan(basePackageClasses = ApplicationConfig.class)
//위의 Annotation 사용시, bean 설정 일일이 안해줘도 됨.*/
//@Configuration
//public class ApplicationConfig {
//
//	@Bean
//	public UserService userService() {
//		UserService userService = new UserService();
//		userService.setUserRepository(userRepository()); // 의존성 주입(DI)
//		return userService;
//	}
//
//	@Bean
//	public UserRepository userRepository() {
//		return new UserRepository();
//	}
//	
//}
