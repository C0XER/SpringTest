package org.example.spring;

import org.springframework.stereotype.Component;

@Component("someClassics")
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic myFactory(){
        return new ClassicalMusic();
    }

    public void myInit(){
        System.out.println("doing my initialisation");
    }
    public void myDestroy(){
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
