package com.raining.spring.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSping {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic(Genre.CLASSICAL);
//        musicPlayer.playMusic(Genre.ROCK);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1);

        context.close();

    }


}
