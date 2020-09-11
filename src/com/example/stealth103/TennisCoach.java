package com.example.stealth103;

import com.example.stealth103.interfaces.ICoach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }
}
