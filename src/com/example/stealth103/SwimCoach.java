package com.example.stealth103;

import com.example.stealth103.interfaces.ICoach;
import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    private IFortuneService fortuneService;

    public SwimCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Sim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
