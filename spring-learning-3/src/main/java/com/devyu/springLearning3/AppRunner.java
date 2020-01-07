package com.devyu.springLearning3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	Single single;
	
	@Autowired
	Proto proto;
	
	@Autowired
	ApplicationContext ctx;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.err.println("== 프로토타입 ==");
		
		System.err.println(ctx.getBean(Proto.class));
		System.err.println(ctx.getBean("proto"));
		System.err.println(ctx.getBean("proto"));
		
		System.err.println("== 싱글톤 ==");
		
		System.err.println(ctx.getBean(Single.class));
		System.err.println(ctx.getBean("single"));
		System.err.println(ctx.getBean("single"));
		
		// 싱글톤 타입의 프로토타입 property는 계속 같은 인스턴스만 출력됨
		// 해결방안 
		// 1.proxyMode = scopedProxyMode.TARGET_CLASS
		// why? - proxy를 거쳐서 참조하기 때문에
		// 2. ObjectFactory<Proto>
		System.err.println("== 싱글톤의 프로토타입 property ==");
		System.err.println(ctx.getBean(Single.class).getProto());
		System.err.println(ctx.getBean(Single.class).getProto());
		System.err.println(ctx.getBean(Single.class).getProto());
		
	}

}
