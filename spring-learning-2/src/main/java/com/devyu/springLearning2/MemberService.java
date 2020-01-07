package com.devyu.springLearning2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
//	1. field를 통한 의존성 주입
//	@Autowired
//	MemberRepository memberRepository;

	
//	2. setter 메소드를 통한 의존성 주입
//	// default는 true이며 false의 경우 Repository가 bean으로 등록되지 않아도 D.I 기능만 하지 않을뿐 정상작동
//	@Autowired(required = false)
//	public void setMemberRepository(MemberRepository memberRepository) {
//		this.memberRepository = memberRepository;
//	}
	
//	3. 생성자를 통한 의존성 주입
// 생성자를 통한 의존성 주입의 경우 MemberService가 bean으로 등록되려면 
// 	그 이전에 생성자를 통해서 MemberRepository가 등록되는 경우임.
// 따라서 @Autowired 를 false로 지정해도 error가 발생할 수 밖에없음
// 참고로 spring 4.3부터 생성자를 통한 의존성 주입에는 @Autowired 생략가능
//	@Autowired
//	public MemberService(MemberRepository memberRepository) {
//		this.memberRepository = memberRepository;
//	} 

	//-----------------------------------------------------------------------
	
	// Repository 인터페이스를 구현한 2개의 class가 있을경우,
	// 해당하는 인터페이스 D.I를 해보았을때, spring은 2가지 구현체중에
	// 무엇을 원하는지 몰라서 error가 발생함
	
	// 해결방안 4가지
	// 1. 주입하는 객체에 @Primary를 해당하는 class에 작성
	// 2. 주입되는 객체에 @Qualifier("memberInter1") / bean의 이름은 class 이름에서 맨 앞 스펠링의 소문자로 자동생성됨
	// 3. 주입되는 객체에 List<MemberInterRepository> 로 전체 받기
	// 4.(비추천) 참조변수명을 class 이름에 첫번째 스펠링을 소문자로 지정하는것 ex) MemberInterRepository memberInterRepository
	
//	@Autowired @Qualifier("memberInter1") // 해결방안 2
//	MemberInterRepository memberInterRepository;

	
	
}
