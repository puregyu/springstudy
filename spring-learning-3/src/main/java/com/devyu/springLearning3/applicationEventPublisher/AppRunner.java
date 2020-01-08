//package com.devyu.springLearning3.applicationEventPublisher;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppRunner implements ApplicationRunner {
//
//	@Autowired
//	ApplicationContext ctx;
//	
//	@Autowired
//	ApplicationEventPublisher applicationEventPublisher; 
//	
//
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		
//		// 이벤트 발생시키기
//		applicationEventPublisher.publishEvent(new MyEvent(this, 2000));
//	}
//}
