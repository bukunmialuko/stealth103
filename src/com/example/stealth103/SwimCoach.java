package com.example.stealth103;

import com.example.stealth103.interfaces.ICoach;
import com.example.stealth103.interfaces.IFortuneService;

public class SwimCoach implements ICoach {

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
}
