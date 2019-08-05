package com.raining.spring.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic, @Qualifier("rockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic(Genre genre) {
        int randSong = (int) (Math.random()*10 % 3);
        //System.out.println("randam number "+ randSong);
        switch (genre){
            case CLASSICAL:
                System.out.println( ClassicalMusic.getClassicalMusic().getMusicList().get(randSong));
                break;
            case ROCK:
                System.out.println(  RockMusic.getRockMusic().getRockList().get(randSong));
                break;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}