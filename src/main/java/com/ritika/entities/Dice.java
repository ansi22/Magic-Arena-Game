package com.ritika.entities;

import java.util.Random;

// entity for dice roll (randomly between values 1-6)
public class Dice {
    private Random random;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(6)+1;
    }
}
