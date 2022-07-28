package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.login.AccountNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //4. 객체담는통
        AnnotationConfigApplicationContext acac=
                new AnnotationConfigApplicationContext(AppCtx.class);

        MemberService ms = acac.getBean(MemberService.class);
        ms.regist();
        ms.getall();

        ChangePwdService cs = acac.getBean(ChangePwdService.class);

        cs.chpwd();

        acac.close();
    }
}