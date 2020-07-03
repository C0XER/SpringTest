package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList;
    private Music music;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    //private ClassicalMusic classicalMusic;
    //private RockMusic rockMusic;

    public MusicPlayer(){}

    @Autowired

    public void setMusic2( @Qualifier("rockMusic") Music music2) {
        this.music2 = music2;
    }
    @Autowired

    public void setMusic(@Qualifier("someClassics") Music music) {
        this.music = music;
    }

    public Music getMusic2() {
        return music2;
    }

    public Music getMusic() {
        return music;
    }

    //@Autowired
    public MusicPlayer( Music music,
                        Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public MusicPlayer(Music music){
        this.music = music;
    }

    public String playMusic(){
        return"Playing: "+music.getSong()+ ", " + music2.getSong();
        //System.out.println("Playing: "+classicalMusic.getSong());
        //System.out.println("Playing: "+rockMusic.getSong());
    }

    public String playRandomMusic(Genres genre){
        String result;
        switch (genre){
            case ROCK: result = music2.getSong(); break;
            case CLASSICAL: result = music.getSong();break;
            default: result = "Incorrect type of music";
        }
        return result;
    }
    public void playAllMusic(){
        for (Music genre : musicList){
            System.out.println(genre.getSong());
        }
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
