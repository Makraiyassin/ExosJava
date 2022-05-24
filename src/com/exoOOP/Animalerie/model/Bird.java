package com.exoOOP.Animalerie.model;

public class Bird  extends Animal{

    private String color;
    private Habitat habitat;

    public Bird(String name, Sexe sexe, double weight, int age, String color, Habitat habitat) {
        super(name, sexe, weight, age);
        super.setProbabilityOfDeath(0.03);
        this.color = color;
        this.habitat = habitat;
    }

    public String yell(){
        return "CUI! CUI!";
    }

    @Override
    public String toString() {
        return "\nBird{" +
                "name='" + super.getName() + '\'' +
                ", sexe=" + super.getSexe() +
                ", poid=" + super.getWeight() +
                ", age=" + super.getAge() +
                ", humanEquivalent=" + super.getHumanEquivalent() +
                ", probabilityOfDeath=" + super.getProbabilityOfDeath() +
                ", arrivate=" + super.getArrivate() +
                ", death=" + super.isDeath() +
                ", color='" + color +
                ", habitat=" + habitat +
                '}';
    }
}
