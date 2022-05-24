package com.exoOOP.Animalerie.model;

//Pour calculer l'âge de votre chien, il faut considérer qu'un chiot vieillit 15 fois plus rapidement que l'homme
// durant sa première année, puis ajouter 6 ans durant la deuxième année. Ensuite, il suffit d'ajouter environ 4 ans,
// pour chaque année supplémentaire et obtenir l'âge de votre chien en années humaines.

public class Dog  extends Animal{
    private String colorOfNecklace;
    private  String race;
    private boolean trained;

    public Dog(String name, Sexe sexe, double weight, int age, String colorOfNecklace, String race, boolean trained) {
        super(name, sexe, weight, age);
        super.setProbabilityOfDeath(0.01);
        this.colorOfNecklace = colorOfNecklace;
        this.race = race;
        this.trained = trained;
    }

    public String yell(){
        return "WAF! WAF!";
    }

    @Override
    public String toString() {
        return "\nDog{" +
                "name='" + super.getName() + '\'' +
                ", sexe=" + super.getSexe() +
                ", poid=" + super.getWeight() +
                ", age=" + super.getAge() +
                ", humanEquivalent=" + super.getHumanEquivalent() +
                ", probabilityOfDeath=" + super.getProbabilityOfDeath() +
                ", arrivate=" + super.getArrivate() +
                ", death=" + super.isDeath() +
                ", Couleur de colier='" + this.colorOfNecklace + '\'' +
                ", Race=" + this.race +
                ", Dréssé=" + this.trained +
                '}';
    }
}
