package com.devyu.springLearning3.applicationEventPublisher;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//@Component
//public class MyEventHandler implements ApplicationListener<MyEvent>{
//
//	@Override
//	public void onApplicationEvent(MyEvent event) {
//		// TODO Auto-generated method stub
//		System.out.println("이벤트 받았다 1번 ");
//		System.out.println(event.getData());
//	}
//
//}

@Component
public class MyEventHandler{

	@EventListener
	// 이벤트 순서
	@Order(Ordered.HIGHEST_PRECEDENCE + 1)
//	@Async // 순서보장은 안되지만 비동기로 실행가능
//	각각의 Thread 풀에서 돈다 (@enableAsync 를 메인class에 붙여줘야만 함)
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("이벤트 받았다 1번 ");
		System.out.println(event.getData());
	}

}