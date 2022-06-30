package com.coursAlex.competitionSportive.enumerations;

public enum Localisation {
    REGIONAL(1000, 25),
    NATIONAL(10_000, 50),
    INTERNATIONNAL(100_000, 100);
    private int money;
    private int numberParticipant;
    Localisation(int money, int numberParticipant){
        this.money = money;
        this.numberParticipant=numberParticipant;
    }

    public int getMoney() {
        return money;
    }

    public int getNumberParticipant() {
        return numberParticipant;
    }
}
