package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration //어노테이션 기반
public class AppContext {

    @Bean
    public Greeter greeter(){
        return new Greeter();
    }
}
