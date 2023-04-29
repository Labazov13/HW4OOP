package org.example.shields;

import org.example.Shield;

import java.util.Random;

public class LightShield implements Shield {
    @Override
    public int getProtection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Легкий, возможность отразить %d очков урона", getProtection());
    }
}
