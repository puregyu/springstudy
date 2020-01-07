package com.devyu.springLearning3;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

	Proto proto;
	
	Proto getProto() {
		return proto;
	}
	
	
	// 해결방안 2.
//	@Autowired
//	ObjectProvider<Proto> proto;

//	Proto getProto() {
//		return proto.getIfAvailable();
//	}
}
