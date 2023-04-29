package org.example.shields;

import org.example.Shield;

import java.util.Random;

public class MediumShield implements Shield {
    @Override
    public int getProtection() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Средний, возможность отразить %d очков урона", getProtection());
    }
}
