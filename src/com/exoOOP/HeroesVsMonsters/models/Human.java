package com.exoOOP.HeroesVsMonsters.models;

public class Human extends Heroes{

    public Human(String name) {
        super(name);
        this.setEndurance(this.getEndurance()+1);
        this.setStrength(this.getStrength()+1);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + this.getName() + '\'' +
                ", pv=" + this.getPv() +
                ", pvMax=" + this.getPvMax() +
                ", strength=" + this.getStrength() +
                ", endurance=" + this.getEndurance() +
                ", stockGold=" + this.getStockGold() +
                ", stockLeather=" + this.getStockLeather() +
                '}';
    }

}
