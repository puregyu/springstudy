//package com.devyu.springLearning3.messageSource;
//import java.util.Locale;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.MessageSource;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppRunner implements ApplicationRunner {
//
//	@Autowired
//	ApplicationContext ctx;
//
//	@Autowired
//	MessageSource messageSource;
//	
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		
////		국제화 (i18n) 기능을 제공하는 인터페이스. 
////		 
////		ApplicationContext extends MessageSource ● getMessage(String code, Object[] args, String, default, Locale, loc) ● ... 
////		 
////		스프링 부트를 사용한다면 별다른 설정 필요없이 messages.properties 사용할 수 있음 ● messages.properties ● messages_ko_kr.properties ● ... 
//		 
//		
//		// messageSouce 사용
//		System.out.println(messageSource.getMessage("greeting", new String[] {"devyu"}, Locale.getDefault()));
//		System.out.println(messageSource.getMessage("greeting", new String[] {"devyu"}, Locale.KOREA));
//		
//	}
//
//}
