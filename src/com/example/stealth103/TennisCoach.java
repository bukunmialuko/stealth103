package com.example.stealth103;

import com.example.stealth103.interfaces.ICoach;
import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

    private IFortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis coach inside default constructor");
    }

    @Autowired
    public void doSomething(IFortuneService fortuneService) {
        System.out.println("Tennis coach inside doSomething()");

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
