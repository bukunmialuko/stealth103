package com.example.stealth103;

import com.example.stealth103.interfaces.IFortuneService;

public class SadFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Its sad that some people dont tae training serious ";
    }
}
