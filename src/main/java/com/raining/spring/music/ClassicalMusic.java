package com.raining.spring.music;

public class ClassicalMusic implements Music {
    private  ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
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
