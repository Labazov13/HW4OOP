package org.example;

import org.example.shields.HeavyShield;
import org.example.shields.LightShield;
import org.example.shields.MediumShield;

public class Main {
    public static void main(String[] args) {
        //Создание команды лучников
        /*Team <Archer> archerTeam = new Team<>();
        archerTeam.add(new Archer(150, "Petr", new Bow(), new LightShield()));
        archerTeam.add(new Archer(150, "Gera", new Bow(), new LightShield()));
        System.out.println(archerTeam);

        //Создание команды ассасинов
        Team <Assasin> assasinTeam = new Team<>();
        assasinTeam.add(new Assasin(200, "Zhora", new Knife(), new MediumShield()));
        assasinTeam.add(new Assasin(200, "Mira", new Knife(), new MediumShield()));
        System.out.println(assasinTeam);

        //Создание команды копьеносцев
        Team <Halberdier> halberdierTeam = new Team<>();
        halberdierTeam.add(new Halberdier(150, "Mitya", new Spear(), new HeavyShield()));
        halberdierTeam.add(new Halberdier(150, "Slava", new Spear(), new HeavyShield()));
        System.out.println(halberdierTeam);*/


        //Вариант битвы воин против воина
        /*Assasin as1 = new Assasin(50, "Ass1", new Knife(), new MediumShield());
        Assasin as2 = new Assasin(50, "Ass2", new Knife(), new MediumShield());
        Battle battle = new Battle(as1, as2);
        Warrior winner = battle.fight();
        System.out.println(winner);*/

        Halberdier h1 = new Halberdier(90, "petr", new Spear(), new HeavyShield());
        Halberdier h2 = new Halberdier(90, "dkjdkd", new Spear(), new HeavyShield());
        System.out.println(h1);
        System.out.println(h2);
        Battle battle = new Battle(h1, h2);
        Warrior winner = battle.fight();
        System.out.println(winner);
    }
}