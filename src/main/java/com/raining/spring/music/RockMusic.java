package com.raining.spring.music;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> rockList = Arrays.asList("Warriors", "Radioactive", "Believer");
    @Override
    public String getSong() {
        return "Warriors";
    }

    private RockMusic() {}
    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
    public List<String> getRockList() {
        return rockList;
    }
}
