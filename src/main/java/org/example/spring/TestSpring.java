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
    }
}