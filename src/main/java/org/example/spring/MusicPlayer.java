package org.example.spring;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println(music.getSong());
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
