package com.exoOOP.combatDeCreatures.model;

import java.util.Random;

public class Creature {
    private Random rand;
    private String name;
    private int force;
    private int armure;
    private int armureTotal;
    private boolean positionDefense;
    private boolean positionEsquive;
    private int vitesse;
    private int pv;

    public Creature(String name, int force, int armure, int vitesse, int pv) {
        this.rand = new Random();
        this.positionDefense = false;
        this.positionEsquive = false;
        this.name = name;
        if(force+armure+vitesse+pv>42){
            System.out.println("les statistiques entrées dépassent 42 => les statistiques ont été attribuées par défault...");
            this.force = 10;
            this.armure = 10;
            this.armureTotal = 10;
            this.vitesse = 10;
            this.pv = 12;
        }else{
            this.pv = pv;
            this.force = force;
            this.armure = armure;
            this.armureTotal = armure;
            this.vitesse = vitesse;
        }
    }

    public void attaque(Creature creatureB){
        int attaqueTmp = this.force;
        if (this.rand.nextInt(100) < 5){
            System.out.println("coup critique! ");
            attaqueTmp =  this.force * 2 ;
        }
        creatureB.degat(attaqueTmp);
    }

    public void degat(int attaque){
        if (positionEsquive){
            if(this.rand.nextInt(100) < 50 ){
                if(positionDefense){
                    attaque /= 2;
                }
                if (this.armure>0){
                    int shield = this.armure;
                    if(shield>attaque) {
                        shield-= attaque;
                    }else{
                        attaque -=shield;
                        shield = 0;
                        this.pv -= attaque;
                    }
                    setArmure(shield);
                }
                if(getPv()==0){
                    System.out.printf("%s est mort...", this.name);
                }
            };
        }else{
            System.out.printf("%s a ésquivé l'attaque!", this.name);
        }
    }

//    public void changerDeCreature(){}

//#region Getters and Setters
    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getArmure() {
        return armure;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public boolean isPositionDefense() {
        return positionDefense;
    }

    public void setPositionDefense(boolean positionDefense) {
        this.positionDefense = positionDefense;
    }

    public boolean isPositionEsquive() {
        return positionEsquive;
    }

    public void setPositionEsquive(boolean positionEsquive) {
        this.positionEsquive = positionEsquive;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getArmureTotal() {
        return armureTotal;
    }

    //endregion


    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", force=" + force +
                ", armure=" + armure +
                ", vitesse=" + vitesse +
                ", pv=" + pv +
                '}';
    }
}
