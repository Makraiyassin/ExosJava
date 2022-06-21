package com.exoOOP.HeroesVsMonsters.models;

import com.exoOOP.HeroesVsMonsters.Interfaces.Gold;
import com.exoOOP.HeroesVsMonsters.Interfaces.Leather;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Helpers {
    public static int diceEnduranceAndStrength(){
        Random rand = new Random();
        ArrayList<Integer> dice = new ArrayList<>();

        int result;

        for (int i = 0; i < 4; i++) {
            dice.add(rand.nextInt(8)+1);
        }
        for (int i = 0; i < dice.size(); i++) {
            if (Objects.equals(dice.get(i), Collections.min(dice))) {
                dice.remove(i);
                break;
            }
        }
        result = sum(dice);
        return result;
    }
    public static int diceHit(int strength){
        Random rand = new Random();
        int dice = rand.nextInt(6)+1;
        return  dice + getModifier(strength);
    }
    public static int dice(int nbr){
        Random rand = new Random();
        int dice = rand.nextInt(nbr+1)+1;
        return  dice ;
    }
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list)
            sum += i;

        return sum;
    }
    public static int getModifier(int nbr){
        int modifier ;
        if(nbr < 5){
            modifier = -1;
        }else if(nbr < 10){
            modifier = 0;
        } else if (nbr < 15) {
            modifier = 1;
        }else{
            modifier = 2;
        }
        return modifier;
    }

    public static void drop(Character personA, Character personB){
        if (personB instanceof Leather){
            Heroes hero = (Heroes) personA;
            int leatherMonster = ((Leather) personB).getStockLeather();
            ((Heroes) personA).setStockLeather( hero.getStockLeather() + leatherMonster);
            ((Leather) personB).setStockLeather(0);
        }
        if (personB instanceof Gold){
            Heroes hero = (Heroes) personA;
            int goldMonster = ((Gold) personB).getStockGold();
            hero.setStockGold(  hero.getStockGold() + goldMonster);
            ((Gold) personB).setStockGold(0);
        }
    }

    public static void fight(Character personA, Character personB){
        while (!personA.isDead() && !personB.isDead()){
            personA.attack(personB);
            personB.attack(personA);

            if(personB.isDead()){
                if(personA instanceof Heroes hero){
                    drop(personA, personB);
                    hero.rest();
                }
            } else if(personA.isDead()){
                if(personB instanceof Heroes hero){
                    drop(personB, personA);
                    hero.rest();
                }
            }
        }
    }
}

