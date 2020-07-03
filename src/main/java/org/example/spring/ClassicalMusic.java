package org.example.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("someClassics")
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();
   // private ClassicalMusic(){}

    {
        songs.add("Valkirian flyght");
        songs.add("Hungarian Rapsody");
        songs.add("Moon sonate");
    }

    /*
    public static ClassicalMusic myFactory(){
        return new ClassicalMusic();
    }

     */
    @PostConstruct
    public void myInit(){
        System.out.println("doing my initialisation");
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println("Doing my destroy");
    }



    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(3));
    }
}
