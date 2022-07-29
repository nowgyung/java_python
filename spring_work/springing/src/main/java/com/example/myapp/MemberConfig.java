package com.example.myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

}
