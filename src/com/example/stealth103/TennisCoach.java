package com.example.stealth103;

import com.example.stealth103.interfaces.ICoach;
import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach, InitializingBean, DisposableBean {

    @Autowired
    @Qualifier("randomFortuneService")
    private IFortuneService fortuneService;

    // define init method
    public void doMyStartupStuff(){
        System.out.println("Tennis coach inside of doMyStartupStuff()");
    }
    // define destroy method
    public void close(){
        System.out.println("Tennis coach inside of doMyCleanupStuff()");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Tennis coach inside of afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("\nTennis coach inside of destroy()");

    }

}
