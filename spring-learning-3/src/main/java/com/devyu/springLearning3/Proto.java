package com.devyu.springLearning3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // instance가 여러개

// 해결방안 1.
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {
	
	// field를 통한 DI
	@Autowired
	Single single;
}
