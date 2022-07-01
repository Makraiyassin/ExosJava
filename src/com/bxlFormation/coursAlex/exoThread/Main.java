package com.bxlFormation.coursAlex.exoThread;

import java.util.ArrayList;

public class Main {

    public static Carcasse carcasse ;
    public static Moteur moteur ;

    public static void main(String[] args) {

//        final Carcasse[] carcasse = new Carcasse[1];
        final ArrayList<Roue> roues= new ArrayList<>();

        Thread thCarcasse = new Thread(()->{
            System.out.println("production de la carcasse en cours...");
            try {
                Thread.sleep(2000L);
                carcasse =new Carcasse(TypeCarcasse.BERLINNE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thMoteur = new Thread(()->{
            System.out.println("production du moteur en cours...");
            try {
                Thread.sleep(2000L);
                moteur =new Moteur(68);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thRoue = new Thread(()->{
            System.out.println("production des 4 roues en cours...");
            try {
                for (int i = 0; i < 4; i++) {

                    Thread.sleep(800L);
                    Roue roue =new Roue(2);
                    roues.add(roue);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }        });

        thCarcasse.start();
        thMoteur.start();
        thRoue.start();

        try {
            thCarcasse.join();
            thMoteur.join();
            thRoue.join();
            Voiture voiture = new Voiture(carcasse, moteur, roues);
            System.out.println(voiture);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

