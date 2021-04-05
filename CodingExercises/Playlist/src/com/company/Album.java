package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            Song song = new Song(title, duration);
            songs.add(song);
            return findSong(title) != null;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList playlist) {
        try {
            if (!playlist.contains(findSong(songs.get(track - 1).getTitle()))) {
                Song songToAdd = songs.get(track - 1);
                playlist.add(songToAdd);
                if (playlist.contains(songToAdd)) {
                    return true;
                }
                return false;
            }
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList playlist) {
        if (findSong(title) != null) {
            playlist.add(findSong(title));
            return playlist.contains(findSong(title));
        }
        return false;
    }
}











