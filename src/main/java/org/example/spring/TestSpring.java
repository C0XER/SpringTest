package org.example.spring;

import org.springframework.context.ApplicationContext;
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

       /*  //xml config
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

        */
        /*
       // annotation
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music classicalMusic = context.getBean("someClassics",ClassicalMusic.class);
        Music rock = context.getBean("rockMusic",RockMusic.class);
        System.out.println(classicalMusic.getSong());
        MusicPlayer musicPlayer = new MusicPlayer(rock);
        musicPlayer.playMusic();

         */
        // @Autowired
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
}
