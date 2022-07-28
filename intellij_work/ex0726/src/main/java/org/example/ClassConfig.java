package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(ImportConfig.class)
public class ClassConfig {

    @Autowired //getBean 대신 사용, 자동으로 주입받아달라
    private MemberDao memberDao;
    @Autowired
    private MemberPrinter memberPrinter;

    //생성자에 의한 DI방식
//    @Bean
//    public  MemberService memberService(){
//        return  new MemberService(memberDao());
//    }
    //setter에 의한 DI방식
    @Bean
    public MemberService memberService() {
    MemberService ms = new MemberService();
//    ms.setMemberDao(memberDao);
//    ms.setMemberPrinter(memberPrinter);
    return ms;
    }
}
