package com.company;

import java.util.Scanner;

public class Main {
    // songs - I guess these won't be created normally as the requirements definitions aren't great
    private static Song godzilla = new Song("Godzilla", 3.42);
    private static Song nothingElseMatters = new Song("Nothing Else Matters", 6.26);
    private static Song heyThereDelilah = new Song("Hey There Delilah", 3.57);
    private static Song theReaper = new Song("(Don't fear) The Reaper", 5.09);

    // albums
    private static Album blueOysterCult = new Album("Blue Oyster Cult");
    private static Album Metallica = new Album("Metallica");

    private static void printMenu() {
        System.out.println(
                "Enter one of the following commands:\n" +
                "1. Quit\n" +
                "2. Next song\n" +
                "3. Previous song\n" +
                "4. Replay song\n" +
                "5. Remove current song from playlist"
        );
    }

    public static void main(String[] args) {
        PlayList playList = new PlayList("My Playlist");
        // add songs to playlist
        playList.addSongToPlaylist(godzilla);
        playList.addSongToPlaylist(theReaper);
        playList.addSongToPlaylist(nothingElseMatters);

        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Quitting...");
                    quit = true;
                    break;
                case 2:
                    playList.playNextSong();
                    break;
                case 3:
                    System.out.println("Previous song");
                    break;
                case 4:
                    System.out.println("Replay song");
                    break;
                case 5:
                    System.out.println("Remove current song from playlist");
                    break;
                case 6:
                    System.out.println("Print menu");
                    break;
                default:
                    System.out.println("Command not found. Try again");
                    System.out.println("Print menu");
            }
        }
    }
}

// I am abandoning this project. The requirements are defined poorly. This project is picked up again in the exercises,
// where it will be more well-defined and will encounter unit tests.