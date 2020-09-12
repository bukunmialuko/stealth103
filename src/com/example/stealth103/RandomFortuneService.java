package com.example.stealth103;

import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomService implements IFortuneService {
    @Override
    public String getFortune() {
        return "null";
    }
}
