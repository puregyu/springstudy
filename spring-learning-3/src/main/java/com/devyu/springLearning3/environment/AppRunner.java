/*
 * package com.devyu.springLearning3.environment; import java.util.Arrays;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.ApplicationArguments; import
 * org.springframework.boot.ApplicationRunner; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.core.env.Environment; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class AppRunner implements ApplicationRunner {
 * 
 * @Autowired ApplicationContext ctx;
 * 
 * @Override public void run(ApplicationArguments args) throws Exception {
 * 
 * // Environment의 역할은 활성화할 프로파일 확인 및 설정 // when use it ? // 테스트 환경에서는 A라는 빈을
 * 사용하고, 배포 환경에서는 B라는 빈을 쓰고 싶다. // 이 빈은 모니터링 용도니까 테스트할 때는 필요가 없고 배포할 때만 등록이 되면
 * 좋겠다.
 * 
 * // testing Environment environment = ctx.getEnvironment();
 * System.out.println(Arrays.toString(environment.getActiveProfiles()));
 * System.out.println(Arrays.toString(environment.getDefaultProfiles()));
 * 
 * }
 * 
 * }
 */