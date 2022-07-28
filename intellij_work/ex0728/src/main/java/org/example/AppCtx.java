package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//1.스프림객체담는통에 들어갈 내용
public class AppCtx {


    @Bean
    public ChangePwdService changePwdService(){
        return new ChangePwdService();
    }

    @Bean
    public MemberService memberService(){
        return new MemberService();
    }


    @Bean
    @Qualifier("memberdao1")
    public  MemberDao memberDao1(){
        return new MemberDao();

//        @Bean
//
//        public  MemberDao memberDao2(){
//            return new MemberDao();



    }

}
