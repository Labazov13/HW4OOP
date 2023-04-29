package org.example;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    List<T> teamList = new ArrayList<>();

    public Team<T> add(T warrior) {
        teamList.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for(T item : teamList){
            warriors.append(item);
            warriors.append("\n");
        }
        warriors.append(String.format("HP %s, max range %d, damage %d",
                healthPoints(), getMaxRange(), getDamage()));
        return warriors.toString();
    }
    public int healthPoints(){
        int sum = 0;
        for(T item : teamList){
            sum += item.getHealthPoint();
        }
        return sum;
    }
    public int getDamage(){
        int sum = 0;
        for(var item : teamList){
            sum += item.getWeapon().damage();
        }
        return sum;
    }
    public int getMaxRange(){
        int max = 0;
        for(var item : teamList){
            if(item instanceof Archer){
                if(max < ((Archer)item).range()){
                    max = ((Archer)item).range();
                }
            }
        }
        return max;
    }
}
