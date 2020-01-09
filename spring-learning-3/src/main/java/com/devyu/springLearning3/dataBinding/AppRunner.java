package com.devyu.springLearning3.dataBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	// data binding test
	// 기술적 관점 : 프로퍼티 값을 타겟 객체에 설정하는 기능
	// 사용자 관점 : 사용자 입력값을 애플리케이션 도메인 모델에 동적으로 변환해 넣어주는 기능
	
	// 고전적인 방법
	
	
	@Autowired
	ApplicationContext ctx;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	}

}