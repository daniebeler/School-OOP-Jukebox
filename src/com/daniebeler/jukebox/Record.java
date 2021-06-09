package com.daniebeler.jukebox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Record {

    private int id;
    private String title;
    private List<Title> titles = new ArrayList<>();

    public Record(String title, int numberOfSongs){
        this.title = title;
        for(int i = 0; i < numberOfSongs; i++){
            String titleName = "Track " + (i+1);
            float titleDuration = 2 + new Random().nextFloat() * (8 - 2);
            titles.add(new Title(titleName, titleDuration));
        }
    }

    public int getSum(){
        return titles.size();
    }

    public Title getTitle(int index){
        return titles.get(index);
    }

    public String getTitleOfRecord(){
        return this.title;
    }

    public float getLengthOfRecord(){
        float length = 0f;
        for(int i = 0; i < titles.size(); i++){
            length += titles.get(i).getLengthInMinutes();
        }

        return length;
    }

}
