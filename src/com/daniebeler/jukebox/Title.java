package com.daniebeler.jukebox;

import java.util.Random;

public class Title {

    private String title;
    private float lengthInMinutes;

    public Title(String title, float lengthInMinutes){
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public float getLengthInMinutes() {
        return lengthInMinutes;
    }
}
