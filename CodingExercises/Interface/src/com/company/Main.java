package com.company;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player("Tim", 10, 15);
        System.out.println(player.toString());
        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println(monster.toString());
    }
}
