package com.bxlFormation.exoOOP.combatDeCreatures.model;

import java.util.ArrayList;

public class Master {
    private String name;
    private ArrayList<Creature> creatures;

    public Master(String name, ArrayList<Creature> creatures) {
        this.name = name;
        this.creatures = creatures;
    }

    public void action(String action, Creature creatureB){
        Creature creatureA = this.creatures.get(0);
        switch (action){
            case "attaque":
                System.out.println(creatureA.getName()+" attaque");
                creatureA.attaque(creatureB);
                break;
            case "defense":
                System.out.println(creatureA.getName()+" se defends");
                creatureA.setPositionDefense(true);
                creatureA.setArmure(creatures.get(0).getArmureTotal());
                break;
            case "esquive":
                System.out.println(creatureA.getName()+" se met en position esquive");
                creatureA.setPositionEsquive(true);
                break;

            default:
                break;
        }
    }
    public void reinitialiser(){
        this.creatures.get(0).setPositionDefense(false);
        this.creatures.get(0).setPositionEsquive(false);
    }
//#region Getters/Setters
    public ArrayList<Creature> getCreatures() {
        return creatures;
    }
//    endregion


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", creatures=" + creatures +
                '}';
    }
}
