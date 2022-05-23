package com.exoOOP.combatDeCreatures;

import java.util.ArrayList;

import com.exoOOP.combatDeCreatures.model.Creature;
import com.exoOOP.combatDeCreatures.model.Master;

public class Main {
    public static void main(String[] args) {

        ArrayList<Creature> creatures1 = new ArrayList<>();
        creatures1.add(new Creature("Pikashu", 10,10,11,11));
        creatures1.add(new Creature("Salameche", 14,9,10,9));
        creatures1.add(new Creature("Carapuce", 8,13,9,12));

        ArrayList<Creature> creatures2 = new ArrayList<>();
        creatures2.add(new Creature("Bulbizard", 8,12,11,11));
        creatures2.add(new Creature("Rondoudou", 12,10,11,9));
        creatures2.add(new Creature("Roucoups", 9,10,11,12));


        Master master1 = new Master("Yassin",creatures1);
        Master master2 = new Master("James",creatures2);


        creatures2.get(0).attaque(creatures1.get(0));

        System.out.println(creatures1);
        System.out.println(creatures2);

    }
}
