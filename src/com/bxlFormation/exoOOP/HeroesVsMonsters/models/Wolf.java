package com.bxlFormation.exoOOP.HeroesVsMonsters.models;

import com.bxlFormation.exoOOP.HeroesVsMonsters.Interfaces.Leather;

public class Wolf extends Monster implements Leather {
    private int stockLeather;
    public Wolf(String name) {
        super(name);
    }

//#region Getters/Setters
    public int getStockLeather() {
        return stockLeather;
    }

    @Override
    public void setStockLeather(int stockLeather) {
        this.stockLeather = stockLeather;
    }
//endregion

    @Override
    public String toString() {
        return "Dragon{" +
                "endurance=" + super.getEndurance() +
                ", strength=" + super.getStrength() +
                ", pvMax=" + super.getPvMax() +
                ", name='" + super.getName() + '\'' +
                ", pv=" + super.getPv() +
                ", stockLeather=" + stockLeather +
                '}';
    }
}
