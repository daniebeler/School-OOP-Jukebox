package com.daniebeler.jukebox;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private List<Record> records = new ArrayList<>();
    private int loadedRecord = 0;

    public Magazine(){

    }

    public void addRecord(Record record){
        if(records.size() >= 50){
            System.out.println("All slots are full.");
        }
        else{
            records.add(record);
        }
    }

    public void removeRecord(Record record){
        records.remove(record);
    }

    public void printSumOfMusicInMinutes(){
        float length = 0f;
        for(int i = 0; i < records.size(); i++){
            length += records.get(i).getLengthOfRecord();
        }

        System.out.println("Length of the whole music: " + String.valueOf(length) + " minutes.");
    }

    public void searchRecord(String title){

    }

    public void load(int index){
        if(records.size() < index){
            System.out.println("This record does not exist.");
        }
        else{
            loadedRecord = index;
            System.out.println("Loaded record " + records.get(loadedRecord-1).getTitleOfRecord());
        }
    }

    public void remove(){
        loadedRecord = 0;
        System.out.println("Removed record.");
    }

    public void play(int titleIndex){
        if(loadedRecord == 0){
            System.out.println("No record is loaded");
        }
        else{
            String titleName = records.get(loadedRecord - 1).getTitle(titleIndex-1).getTitle();
            String recordName = records.get(loadedRecord-1).getTitleOfRecord();
            String lenghtOfSong = String.valueOf(records.get(loadedRecord-1).getTitle(titleIndex-1).getLengthInMinutes());
            System.out.println(titleName + " of the record " + recordName + " is playing for " + lenghtOfSong + " minutes.");
        }
    }
}
