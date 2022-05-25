package com.exoOOP.HeroesVsMonsters.models;

import com.exoOOP.HeroesVsMonsters.Interfaces.Gold;
import com.exoOOP.HeroesVsMonsters.Interfaces.Leather;
import static com.exoOOP.HeroesVsMonsters.models.Helpers.dice;

public class Dragon extends Monster implements Leather, Gold {
    private int stockGold;
    private int stockLeather;
    public Dragon(String name) {
        super(name);
        this.stockGold = dice(7);
        this.stockLeather = dice(5);
        this.setStrength(this.getStrength()+1);
    }
//#region Getters/Setters
    public int getStockGold() {
        return stockGold;
    }

    public void setStockGold(int stockGold) {
        this.stockGold = stockGold;
    }

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
                "name='" + this.getName() + '\'' +
                ", pv=" + this.getPv() +
                ", pvMax=" + this.getPvMax() +
                ", strength=" + this.getStrength() +
                ", endurance=" + this.getEndurance() +
                ", stockGold=" + stockGold +
                ", stockLeather=" + stockLeather +
                '}';
    }
}
