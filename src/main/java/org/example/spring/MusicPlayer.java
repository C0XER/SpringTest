package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList;
    private Music music;
    private String name;
    private int volume;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic,RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public String playMusic(){
        return"Playing: "+classicalMusic.getSong();
        //System.out.println("Playing: "+classicalMusic.getSong());
        //System.out.println("Playing: "+rockMusic.getSong());
    }
    public void playAllMusic(){
        for (Music genre : musicList){
            System.out.println(genre.getSong());
        }
    }

    public void setMusic(Music music) {
        this.music = music;
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
