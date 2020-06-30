package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main (String[] args){
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean",Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close(); */

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
               "applicationContext.xml");
       MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
       musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playAllMusic();

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer == secondMusicPlayer);
        System.out.println(musicPlayer);
        System.out.println(secondMusicPlayer);
        musicPlayer.setVolume(22);
        System.out.println(musicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean",ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
