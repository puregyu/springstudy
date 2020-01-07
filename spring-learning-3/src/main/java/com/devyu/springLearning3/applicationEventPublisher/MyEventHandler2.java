package com.devyu.springLearning3.applicationEventPublisher;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler2{

	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("이벤트 받았다 2번 ");
		System.out.println(event.getData());
	}

}