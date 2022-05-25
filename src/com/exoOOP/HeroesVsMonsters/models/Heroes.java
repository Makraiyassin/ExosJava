package com.exoOOP.HeroesVsMonsters.models;

public abstract class Heroes extends Character{
    private int stockGold;
    private int stockLeather;
    public Heroes(String name) {
        super(name);
    }

    public void rest(){
        this.setPv(this.getPvMax());
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

    public void setStockLeather(int stockLeather) {
        this.stockLeather = stockLeather;
    }
//endregion
}
