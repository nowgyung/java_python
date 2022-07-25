package org.example.member;
//객체조립기
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {

    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }
    @Bean MemberREGService memberREGService(){
        return new MemberREGService();
    }

}
