package com.bxlFormation.exoOOP.HeroesVsMonsters;

import static com.bxlFormation.exoOOP.HeroesVsMonsters.models.Helpers.fight;
import com.bxlFormation.exoOOP.HeroesVsMonsters.models.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Heroes hero;

        int random = rand.nextInt(2);

        if(random == 1){
            hero = new Dwarf("Yassin");
        }else{
            hero = new Human("Yassin");
        }

        int i = 1;
        while(!hero.isDead()) {
            Monster monster;
            random = rand.nextInt(3);

            if(random == 2){
                monster = new Dragon(String.format("Dragon n°%s",i));
            }else if(random == 1){
                monster = new Orc(String.format("Orc %s",i));
            }else {
                monster = new Wolf(String.format("Wolf %s",i));
            }

            System.out.println("\n--------------------------------");
            fight(hero,monster);
            i++;
            if (monster.isDead()) System.out.printf("\n%s est mort\n", monster.getName());
        }

        System.out.printf("\n%s est mort\n", hero.getName());
        System.out.println(hero);
    }
}
