package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListAsInstanceObject {
    private ArrayList<String> songs;

    public ListAsInstanceObject(){
        this.songs = new ArrayList<>();
    }

    public void addSong(String song){
        this.songs.add(song);
    }

    public void removeSong(String song){
        this.songs.remove(song);
    }

    public void printSongs(){
        for(String i : this.songs){
            System.out.println(i);
        }
    }

}
