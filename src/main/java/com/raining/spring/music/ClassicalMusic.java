package com.raining.spring.music;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.*;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    private List<String> musicList = Arrays.asList(
            "classic1", "classic2", "classic3");
    private  ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public  List<String> getMusicList() {
        return musicList;
    }

    @Override
    public String getSong() {
        return "classic";
    }

    public void doMyInit(){
        System.out.println("do initialization");
    }
    public void doMyDestroy(){
        System.out.println("do destroy");
    }
}
