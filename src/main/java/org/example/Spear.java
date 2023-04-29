package org.example;

public class Spear implements Weapon{
    @Override
    public int damage() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Копье, урон: %d", damage());
    }
}
