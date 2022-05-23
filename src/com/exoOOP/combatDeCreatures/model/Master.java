package com.exoOOP.combatDeCreatures.model;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Master {
    private String name;
    private ArrayList<Creature> creatures;

    public Master(String name, ArrayList<Creature> creatures) {
        this.name = name;
        this.creatures = creatures;
    }

    public void action(String action, Creature creatureB){
        switch (action){
            case "attaque":
                this.creatures.get(0).attaque(creatureB);
                break;
            case "defense":
                this.creatures.get(0).setPositionDefense(true);
                this.creatures.get(0).setArmure(creatures.get(0).getArmureTotal());
                break;
            case "esquive":
                this.creatures.get(0).setPositionEsquive(true);
                break;

            default:
                break;
        }
    }

    public void reinitialiser(){
//     position defense / position esquive
    }
}