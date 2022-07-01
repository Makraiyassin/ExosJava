package com.bxlFormation.coursAlex.competitionSportive.models;

import java.util.Random;

public class Coureur extends Sportif {
    private int vitesseMoyenne;
    private int poid;
    public Coureur(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
        this.vitesseMoyenne = new Random().nextInt(6)+8;
        this.poid = new Random().nextInt(141)+60;
    }
    public int performer() {
        double result = (double) vitesseMoyenne / poid * (new Random().nextInt(21)+110);
        return (int) result;
    }
}


