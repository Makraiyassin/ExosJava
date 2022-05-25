package com.exoOOP.HeroesVsMonsters.models;

public class Dwarf extends Heroes{
    public Dwarf(String name) {
        super(name);
        this.setEndurance(this.getEndurance()+2);
    }

    @Override
    public String toString() {
        return "Dwarf{" +
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
