package org.example;

import org.example.shields.MediumShield;

import java.util.Random;

public class Assasin extends Warrior <Knife>{
    public Assasin(int healthPoint, String name, Knife knife, MediumShield shield) {
        super(healthPoint, name, knife, shield);
    }

    @Override
    public String toString() {
        return String.format("Ассасин , %s", super.toString());
    }
}
