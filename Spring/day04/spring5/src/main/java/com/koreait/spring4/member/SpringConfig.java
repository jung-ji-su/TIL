package com.koreait.spring4.member;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 각각의 빈을 생성하고 주입까지 시켜준다.
// Controller는 어노테션으로 등록을 해주어야 한다.

//@Configuration
//public class SpringConfig {
//	
//	private final DataSource dataSource;
//	public SpringConfig(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
//
//	@Bean
//	public MemberService memberService() {
//		return new MemberService( memberRepository() );
//	}
//	
//	@Bean
//	public MemberRepository memberRepository() {
////		return new MemoryMemberRepository();
//		return new jdbcMemberRepository(dataSource);
//	}
//	
//}
