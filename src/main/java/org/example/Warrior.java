package org.example;

import org.example.shields.HeavyShield;
import org.example.shields.LightShield;
import org.example.shields.MediumShield;

import java.util.Random;

public abstract class Warrior<T extends Weapon> {
    private int healthPoint;
    private String name;
    protected T weapon;
    protected Shield shield;

    public Warrior(int healthPoint, String name, T weapon, Shield shield) {
        this.healthPoint = healthPoint;
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return String.format(
                "Здоровье: %d, имя: %s, оружие: %s, щит: %s",
                getHealthPoint(), getName(), getWeapon(), getShield());
    }

    public int hit() {
        Random r = new Random();
        return r.nextInt(weapon.damage());
    }

    public int protect() {
        Random r = new Random();
        return r.nextInt(shield.getProtection());
    }

    public boolean isChance(){
        Random rand = new Random();
        int chanceProtect = 0;
        if(shield instanceof HeavyShield){
            chanceProtect = rand.nextInt(-10, 5);
            if(chanceProtect > 0){
                return true;
            }
            return false;
        }
        else if(shield instanceof MediumShield){
            chanceProtect = rand.nextInt(-20, 5);
            if(chanceProtect > 0){
                return true;
            }
            return false;
        }
        else{
            chanceProtect = rand.nextInt(-40, 5);
            if(chanceProtect > 0){
                return true;
            }
            return false;
        }
    }
}
