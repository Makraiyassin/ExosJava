package com.bxlFormation.exoOOP.HeroesVsMonsters.models;

import static com.bxlFormation.exoOOP.HeroesVsMonsters.models.Helpers.*;

public abstract class Character {
    private  String name;
    private int pv;
    private final int pvMax;
    private int strength;
    private int endurance;
    public Character(String name) {
        this.endurance =diceEnduranceAndStrength();
        this.strength = diceEnduranceAndStrength();
        this.pv = this.endurance + getModifier(this.endurance);
        this.pvMax = this.pv;
        this.name = name;
    }
    public boolean isDead() {
        return this.getPv() <= 0;
    }
    public void attack(Character enemy){
        System.out.printf("\n%s attaque %s\n",this.name, enemy.getName());
        int hit = diceHit(this.strength);
        enemy.damage(hit);
    }

    public void damage(int damage){
        this.setPv(this.getPv()-damage);
        System.out.printf("Pv %s - %s => %s", this.getName(),damage, this.getPv());
    }

//#region Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

//endregion

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", pv=" + pv +
                ", pvMax=" + pvMax +
                ", strength=" + strength +
                ", endurance=" + endurance +
                '}';
    }
}

