package com.daniebeler.jukebox;

public class Box {

    public Magazine magazine;

    public Box(){
        magazine = new Magazine();
    }

    public void load(int recordIndex){
        magazine.load(recordIndex);
    }

    public void play(int num){
        magazine.play(num);
    }

    public void remove(){
        magazine.remove();
    }
}
