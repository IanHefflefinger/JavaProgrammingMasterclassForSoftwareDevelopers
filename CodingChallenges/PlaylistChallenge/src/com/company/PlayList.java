package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {
    private String playListTitle;
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;
    private ListIterator<Song> listIterator = playlist.listIterator();

    public PlayList(String playListTitle) {
        this.playListTitle = playListTitle;
        this.albums = new ArrayList<>();
        this.playlist = new LinkedList<>();
    }

    public void addSongToPlaylist(Song song) {
        // iterate through all albums
        for (int i = 0; i < albums.size() - 1; i++) {
            // check if song exists within an album
            if (albums.get(i).getSongs().contains(song)) {
                playlist.add(song);
                System.out.println(song + " added to " + playListTitle);
            } else {
                System.out.println(song + " is not part of an album!");
            }
        }
    }

    public void playNextSong() {
        System.out.println(listIterator.next());
    }
}
