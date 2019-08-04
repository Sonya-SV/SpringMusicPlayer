package com.raining.spring.music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // private Music music;
private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;
    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    public void playMusic(){
        for(Music music : musicList)
         System.out.println("Playing: " + music.getSong());
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

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

//    public void setMusicList(Music music) {
//        musicList.add(music);
//    }
}
