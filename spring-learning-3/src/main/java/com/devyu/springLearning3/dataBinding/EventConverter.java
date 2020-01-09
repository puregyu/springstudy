package com.devyu.springLearning3.dataBinding;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {
	public static class StringToEventConverter implements Converter<String, Event>{
		@Override
		public Event convert(String source) {
			// TODO Auto-generated method stub
			return new Event(Integer.parseInt(source));
		}
	}
	
	public static class EventToString implements Converter<Event, String>{
		@Override
		public String convert(Event source) {
			// TODO Auto-generated method stub
			return source.getId().toString();
		}
	}
}
