package com.bxlFormation.exoOOP.Animalerie.model;

import java.time.LocalDate;
import java.util.Random;

public class Animal {
    Random rand;
    private String name;
    private Sexe sexe;
    private double weight;
    private int age;
    private int humanEquivalent;
    private double probabilityOfDeath;
    private LocalDate arrivate;
    private boolean death;
    public Animal(String name, Sexe sexe, double weight, int age) {
        this.rand = new Random();
        this.arrivate = LocalDate.now();
        this.death = false;
        this.name = name;
        this.sexe = sexe;
        this.weight = weight;
        this.age = age;
    }

    public String  yell(){
        return "?";
    }

    public int  passNight(){
        int count = 0;
        if(!this.death){
            if(this.rand.nextInt(100)<this.probabilityOfDeath*100){
                this.setDeath(true);
                count ++;
            }
        }
        return count;
    }

//#region Getters/Setters

    public String getName() {
        return name;
    }


    public Sexe getSexe() {
        return sexe;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getHumanEquivalent() {
        return humanEquivalent;
    }

    public void setHumanEquivalent(int humanEquivalent) {
        this.humanEquivalent = humanEquivalent;
    }

    public double getProbabilityOfDeath() {
        return probabilityOfDeath;
    }

    public void setProbabilityOfDeath(double probabilityOfDeath) {
        this.probabilityOfDeath = probabilityOfDeath;
    }

    public LocalDate getArrivate() {
        return arrivate;
    }

    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
//    endregion

    @Override
    public String toString() {
        return "\nAnimal{" +
                "name='" + name + '\'' +
                ", sexe=" + sexe +
                ", weight=" + weight +
                ", age=" + age +
                ", humanEquivalent=" + humanEquivalent +
                ", probabilityOfDeath=" + probabilityOfDeath +
                ", arrivate=" + arrivate +
                ", death=" + death +
                '}';
    }
}
