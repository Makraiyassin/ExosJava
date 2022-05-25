package com.exoOOP.HeroesVsMonsters.models;

import com.exoOOP.HeroesVsMonsters.Interfaces.Gold;
import com.exoOOP.HeroesVsMonsters.Interfaces.Leather;

import static com.exoOOP.HeroesVsMonsters.models.Helpers.dice;

public class Orc extends Monster implements Gold {
    private int stockGold;
    public Orc(String name) {
        super(name);
        this.setStrength(this.getStrength()+1);
        this.stockGold = dice(7);

    }

//#region Getters/Setters
    @Override
    public int getStockGold() {
        return stockGold;
    }
    @Override
    public void setStockGold(int stockGold) {
        this.stockGold = stockGold;
    }
//endregion
    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + this.getName() + '\'' +
                ", pv=" + this.getPv() +
                ", pvMax=" + this.getPvMax() +
                ", strength=" + this.getStrength() +
                ", endurance=" + this.getEndurance() +
                ", stockGold=" + stockGold +
                '}';
    }
}
