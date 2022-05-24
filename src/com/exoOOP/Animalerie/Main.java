package com.exoOOP.Animalerie;

import com.exoOOP.Animalerie.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animalerie petsAndCo = new Animalerie();
//        Cat chat1 = new Cat("Tom", Sexe.MALE,3,2,"Joueur", false,false);
//        Cat chat2 = new Cat("Garfields", Sexe.MALE,5,4,"Fénéant", true,true);
//        Dog chien1 = new Dog("Snoopy", Sexe.MALE,5,4, "bleu", "Chiwawa", true);
//        Bird oiseau1 = new Bird("Titi", Sexe.FEMALE,0.3,3, "jaune", Habitat.CAGE);

//        petsAndCo.addAnimal(chat1);
//        petsAndCo.addAnimal(chat2);
//        petsAndCo.addAnimal(chien1);
//        petsAndCo.addAnimal(oiseau1);
//        System.out.println(petsAndCo.night());

        encoding(petsAndCo);
        System.out.println("-----------------------\nnombre de chat: "+petsAndCo.getCountOf("cat"));
        night(petsAndCo);
        System.out.println(petsAndCo);
    }

    public static void encoding(Animalerie animalerie){

        Scanner sc = new Scanner(System.in);
        System.out.println("Combien d'annimaux souhaitez vous encoder: ");
        int numberOfAnimals = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= numberOfAnimals; i++) {
            try {
                System.out.printf("----------\nEncodage de l'animal %s va commencer\n voulez-vous continuer (y/n)? \n--------------\n ", i+1);
                if(sc.nextLine().toLowerCase().equals("y")) {
                    System.out.println("Quel animal voulez-vous encoder?\nchat: 1\nchien: 2\noiseau: 3 ");
                    String name;
                    Sexe sexe;
                    double weight;
                    int age;
                    String temperament;
                    boolean cutClaw;
                    boolean longHair;
                    String color;
                    String race;
                    boolean dressed;
                    Habitat habitat;

                    switch (sc.nextLine()) {
                        case "1":
                            System.out.println("Nom du chat: ");
                            name = sc.nextLine();
                            System.out.println("Sexe du chat (f/m): ");
                            sexe = sc.nextLine().toLowerCase().equals("m") ? Sexe.MALE : Sexe.FEMALE;
                            System.out.println("poid du chat: ");
                            weight = Double.parseDouble(sc.nextLine());
                            ;
                            System.out.println("age du chat: ");
                            age = Integer.parseInt(sc.nextLine());
                            System.out.println("temperament du chat: ");
                            temperament = sc.nextLine();
                            System.out.println("les ongles du chat sont-ils coupés ? (true/false) ");
                            cutClaw = sc.nextBoolean();
                            System.out.println("les poiles du chat sont-ils long ? (true/false");
                            longHair = sc.nextBoolean();
                            ;
                            Cat chat = new Cat(name, sexe, weight, age, temperament, cutClaw, longHair);
                            animalerie.addAnimal(chat);
                            break;
                        case "2":
                            System.out.println("Nom du chien: ");
                            name = sc.nextLine();
                            System.out.println("Sexe du chien (f/m): ");
                            sexe = sc.nextLine().toLowerCase().equals("m") ? Sexe.MALE : Sexe.FEMALE;
                            System.out.println("poid du chien: ");
                            weight = Double.parseDouble(sc.nextLine());
                            ;
                            System.out.println("age du chien: ");
                            age = Integer.parseInt(sc.nextLine());
                            System.out.println("couleur du chien: ");
                            color = sc.nextLine();
                            System.out.println("race du chien: ");
                            race = sc.nextLine();
                            System.out.println("le chien est-il dréssé? (true/false");
                            dressed = sc.nextBoolean();
                            ;
                            Dog chien = new Dog(name, sexe, weight, age, color, race, dressed);
                            animalerie.addAnimal(chien);
                            break;
                        case "3":
                            //        Bird oiseau1 = new Bird("Titi", Sexe.FEMALE,0.3,3, "jaune", Habitat.CAGE);

                            System.out.println("Nom de l'oiseau: ");
                            name = sc.nextLine();
                            System.out.println("Sexe de l'oiseau (f/m): ");
                            sexe = sc.nextLine().toLowerCase().equals("m") ? Sexe.MALE : Sexe.FEMALE;
                            System.out.println("poid de l'oiseau: ");
                            weight = Double.parseDouble(sc.nextLine());
                            ;
                            System.out.println("age de l'oiseau: ");
                            age = Integer.parseInt(sc.nextLine());
                            System.out.println("Couleur de l'oiseau: ");
                            color = sc.nextLine();
                            System.out.println("Quel est l'habitat de l'oiseau?\nvolière: 1\ncage: 2");
                            habitat = sc.nextLine().equals("1") ? Habitat.VOLIERE : Habitat.CAGE;
                            Bird oiseau = new Bird(name, sexe, weight, age, color, habitat);
                            animalerie.addAnimal(oiseau);
                            break;
                        default:
                            break;
                    }
                }
            }
            catch(Exception e) {
                //  Block of code to handle errors
                System.out.printf("une erreur est survenu durant l'encodage de l'annimal %s\n ", i+1);
            }
        }
    }

    public static void night(Animalerie animalerie){
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nuits sont passée: ");
        try {
            int numberOfNights = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numberOfNights; i++) {
                System.out.println(animalerie.night());
            }
        }catch (Exception e){
            System.out.println("une erreur est survenue...");
        }
    }
}
