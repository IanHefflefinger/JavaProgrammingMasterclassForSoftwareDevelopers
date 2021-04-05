package com.company;

import java.util.List;

public class Album {
    private String albumTitle;
    private List<Song> songs;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSongToAlbum(Song song) {
        songs.add(song);
        System.out.println(song + " added to " + albumTitle);
    }
}
