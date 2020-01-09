package com.devyu.springLearning3.dataBinding;

import java.beans.PropertyEditorSupport;

//// PropertyEditor 사용(스프링3.0 이하)
// thread-safety 하지 않기때문에 Bean으로 등록해서 사용하면 안됨
public class EventEditor extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		Event event = (Event)getValue();
		return event.getId().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new Event(Integer.parseInt(text)));
	}
	
}
