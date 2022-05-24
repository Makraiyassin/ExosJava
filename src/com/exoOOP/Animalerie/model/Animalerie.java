package com.exoOOP.Animalerie.model;

import java.util.ArrayList;

public class Animalerie {
    private final ArrayList<Animal> animals;

    public Animalerie() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal( Animal animal){
        animals.add(animal);
    }

    public int getCountOf(String animal){
        int count = 0;
        switch (animal.toLowerCase()){
            case "bird":
                for (Animal anim:this.animals) {
                    if(anim instanceof Bird) {
                        count++;
                    }
                }
                return count;
            case "cat":
                for (Animal anim:this.animals) {
                    if(anim instanceof Cat) {
                        count++;
                    }
                }
                return count;
            case "dog":
                for (Animal anim:this.animals) {
                    if(anim instanceof Dog) {
                        count++;
                    }
                }
                return count;
            default:
                break;
        }

        return 0;
    }

    public String night(){
        System.out.println("------------------------------\nla nuit tombent, lest annimaux s'endorment...");
        int count=0;
        for (Animal anim:animals) {
           count+=anim.passNight();
        }
        return String.format("%s %s %s mort(s) cette nuit...\n------------------------------", count, count>1? "annimaux": "animal", count>1? "sont": "est");

    }
    @Override
    public String toString() {
        return "Animalerie{" +
                "animals=" + this.animals +
                '}';
    }


}
