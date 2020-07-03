package org.example.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Wind cries Mary");
        songs.add("Layla");
        songs.add("Don't fear the reaper");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(3));
    }
}
