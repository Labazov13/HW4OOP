package org.example;

import org.example.shields.HeavyShield;

public class Halberdier extends Warrior<Spear>{
    public Halberdier(int healthPoint, String name, Spear spear, HeavyShield shield) {
        super(healthPoint, name, spear, shield);
    }

    @Override
    public String toString() {
        return String.format("Алебардщик, %s", super.toString());
    }
}
