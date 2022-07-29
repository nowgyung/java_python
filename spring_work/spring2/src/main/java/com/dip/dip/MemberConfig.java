package com.dip.dip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

}
