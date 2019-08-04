package com.raining.spring.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSping {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
   // Music music = context.getBean("musicBean", Music.class);

    //MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(firstMusicPlayer==secondMusicPlayer);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

    context.close();
    }


}
