package com.bxlFormation.exoOOP.Animalerie.model;

//À ses deux ans, on estime que cela correspond à l'âge de 24 ans. Il est alors adulte. À partir de ce stade, on
// considère qu'une année supplémentaire pour un chat équivaut à quatre années humaines. Quand il atteint l'âge de
// 10 ans, votre chat a donc 56 ans en âge humain.

public class Cat  extends Animal{
    private String temperament;
    private boolean cutClaw;
    private boolean longHair;

    public Cat(String name, Sexe sexe, double weight, int age, String temperament, boolean cutClaw, boolean longHair) {
        super(name, sexe, weight, age);
        super.setProbabilityOfDeath(0.005);
        this.temperament = temperament;
        this.cutClaw = cutClaw;
        this.longHair = longHair;
        super.setHumanEquivalent(ageOfCat(age));
    }

    public String yell(){
        return "MIAAAOOOOOOOUUUUUUUUUU";
    }

    public int ageOfCat(int age){
        if(age<= 2){
            return age * 12;
        }else{
            return 24 + ((age-2) * 4);
        }
    }
    @Override
    public String toString() {
        return "\nCat{" +
                "name='" + super.getName() + '\'' +
                ", sexe=" + super.getSexe() +
                ", poid=" + super.getWeight() +
                ", age=" + super.getAge() +
                ", humanEquivalent=" + super.getHumanEquivalent() +
                ", probabilityOfDeath=" + super.getProbabilityOfDeath() +
                ", arrivate=" + super.getArrivate() +
                ", death=" + super.isDeath() +
                ", temperament='" + temperament + '\'' +
                ", cutClaw=" + cutClaw +
                ", longHair=" + longHair +
                '}';
    }
}
