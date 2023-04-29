package org.example.shields;

import org.example.Shield;

import java.util.Random;

public class HeavyShield implements Shield {
    @Override
    public int getProtection() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Тяжелый, возможность отразить %d очков урона", getProtection());
    }
}
