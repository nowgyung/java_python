package com.dip.org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dip.org.member"})
public class AppConfig {

	
//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}
//	
//	@Bean
//	public MemberService memberService() {
//		return new MemberService();
//	}
}
