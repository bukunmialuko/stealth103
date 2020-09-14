package com.example.stealth103;

import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Relax for 8hours";
    }
}
