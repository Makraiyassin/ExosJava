package com.exoOOP.combatDeCreatures;

import java.util.ArrayList;
import java.util.Scanner;

import com.exoOOP.combatDeCreatures.model.Creature;
import com.exoOOP.combatDeCreatures.model.Master;

public class Main {
    public static void main(String[] args) {

        ArrayList<Creature> creatures1 = new ArrayList<>();
        creatures1.add(new Creature("Pikashu", 10,10,11,11));
        creatures1.add(new Creature("Salameche", 14,9,10,9));
        creatures1.add(new Creature("Carapuce", 8,13,9,12));

        ArrayList<Creature> creatures2 = new ArrayList<>();
        creatures2.add(new Creature("Bulbizard", 8,12,11,11));
        creatures2.add(new Creature("Rondoudou", 12,10,11,9));
        creatures2.add(new Creature("Roucoups", 9,10,11,12));

        Master master1 = new Master("Yassin",creatures1);
        Master master2 = new Master("James",creatures2);


//        creatures2.get(0).attaque(creatures1.get(0));
//        System.out.println(creatures1);
//        System.out.println(creatures2);

        battle(master1, master2);
    }

    public static void battle(Master master1, Master master2){
        Scanner sc = new Scanner(System.in);

        Creature creature1 = master1.getCreatures().get(0);
        Creature creature2 = master2.getCreatures().get(0);

        while (creature1.getPv()>0 || creature2.getPv()>0){
            String tmp;
            System.out.println("Joueur 1: quelle action aller vous effectuer?\nAttaquer: 1\nSe defendre: 2\nEsquiver: 3\n");
            tmp = sc.nextLine();
            String actionMaster1 = tmp.equals("3") ? "esquive" : tmp.equals("2") ? "defense" : "attaque";
            System.out.println("joueur 2: quelle action aller vous effectuer?\nAttaquer: 1\nSe defendre: 2\nEsquiver: 3\n");
            tmp = sc.nextLine();
            String actionMaster2 = tmp.equals("3") ? "esquive" : tmp.equals("2") ? "defense" : "attaque";
            if(actionMaster1.equals("attaque") && actionMaster2.equals("attaque")){
                if(creature1.getVitesse()>creature2.getVitesse()){
                    master1.action(creature2);
                    master2.action(creature1);
                }else{
                    master2.action(creature1);
                    master1.action(creature2);

                }
            }else{
                if(actionMaster1.equals("attaque") && !actionMaster2.equals("attaque")){
                    master2.action(actionMaster2);
                    master1.action(creature1);
                }else if(!actionMaster1.equals("attaque") && actionMaster2.equals("attaque")){
                    master1.action(actionMaster2);
                    master2.action(creature1);
                }else{
                    master1.action(actionMaster1);
                    master2.action(actionMaster2);
                }
            }
            System.out.println(master1);
            System.out.println(master2);
        }
        master1.reinitialiser();
        master2.reinitialiser();
    }
}
