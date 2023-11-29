package com.ritika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ritika.entities.Player;
import com.ritika.service.MagicalArenaService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1data = new ArrayList<>();
        List<Integer> player2data = new ArrayList<>();

        // take player1's information: health, strength and attack
        System.out.print("Enter Player1 info. health, strength and attack:");

        for(int i=0;i<3;i++) {
            int val=scanner.nextInt();
            player1data.add(val);
        }
        
        // take player1's information: health, strength and attack
        System.out.print("Enter Player2 info. health, strength and attack:");

        for(int i=0;i<3;i++) {
            int val=scanner.nextInt();
            player2data.add(val);
        }

        // assign values to players
        Player player1 = new Player(player1data.get(0), player1data.get(1), player1data.get(2));
        Player player2 = new Player(player2data.get(0), player2data.get(1), player2data.get(2));

        // initiate the game
        MagicalArenaService magicalArenaService = new MagicalArenaService(player1, player2);
        magicalArenaService.PlayGame();

        scanner.close();
    }
}