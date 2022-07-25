package org.example;
// spring 객체담는 통을 만들어줘, 객체 컨테이너

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {

    @Bean // 컨테이너 안에 빈을 넣어
    public A a(){
        return new A();
    }
}
