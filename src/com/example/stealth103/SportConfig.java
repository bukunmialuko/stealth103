package com.example.stealth103;

import com.example.stealth103.interfaces.ICoach;
import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.stealth103")
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public IFortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for swim coach AND inject dependency
    @Bean
    public ICoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
