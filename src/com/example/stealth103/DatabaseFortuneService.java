package com.example.stealth103;

import com.example.stealth103.interfaces.IFortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "null";
    }
}
