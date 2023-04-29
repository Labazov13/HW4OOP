package org.example;

import org.example.shields.LightShield;

import java.util.Random;

public class Archer extends Warrior <Bow>{
    public Archer(int healthPoint, String name, Bow bow, LightShield shield) {
        super(healthPoint, name, bow, shield);
    }
    public int range(){
        Random rand = new Random();
        return rand.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Лучник , %s", super.toString());
    }
}
