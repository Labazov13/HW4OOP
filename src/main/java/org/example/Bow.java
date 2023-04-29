package org.example;

public class Bow implements Weapon{
    public int range(){
        return 50;
    }
    @Override
    public int damage() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Лук, урон: %d, дальность стрельбы: %d", damage(), range());
    }
}
