package com.devyu.springLearning3.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("test") // test라는 profile로 어플리케이션을 동작시키지 않으면 BookRepository는 빈으로 등록되지 않음
public class TestConfiguration {

	// bean 추가
	@Bean
	public BookRepository bookRepository() {
		return new TestBookRepository();
	}
}
