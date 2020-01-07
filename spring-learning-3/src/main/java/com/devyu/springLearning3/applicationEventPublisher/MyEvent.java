package com.devyu.springLearning3.applicationEventPublisher;

import org.springframework.context.ApplicationEvent;

// spring 4.2 이하
//public class MyEvent  extends ApplicationEvent{
//
//	private int data;
//	
//	public MyEvent(Object source) {
//		super(source);
//	}
//	
//	public MyEvent(Object source, int data) {
//		super(source);
//		this.data = data;
//	}
//
//	int getData() {
//		return data;
//	}
//
//	
//}

//spring 4.2 이후
public class MyEvent {

	private int data;
	
	private Object source;
	
	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}

	int getData() {
		return data;
	}
}
