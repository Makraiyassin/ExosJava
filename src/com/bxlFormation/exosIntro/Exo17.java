package com.bxlFormation.exosIntro;

import java.util.Scanner;

public class Exo17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockCoca = 2;
        int stockEau = 0;
        boolean enStock = false;
        boolean wanted;
        int choix;

        do {
            System.out.println("Quel boisson voulez-vous ? (1: coca, 2: eau)");
            choix = Integer.parseInt(sc.nextLine());
            switch (choix) {
                case 1:
                    if (stockCoca > 0) {
                        enStock = true;
                        stockCoca--;
                    }
                    else {
                        enStock = false;
                    }
                    break;
                case 2:
                    if (stockEau > 0) {
                        enStock = true;
                        stockEau--;
                    }
                    else {
                        enStock = false;
                    }
                    break;
                default:
                    System.out.println("Nombre encodé incorrect");
            }

            if (enStock) {
                if (choix == 1) {
                    System.out.println("Voilà votre coca");
                }
                else {
                    System.out.println("Voilà votre fanta");
                }
            }
            else {
                System.out.println("Une erreur est survenue");
            }

            System.out.println("Voulez-vous encore une boisson ? (true/false) ");
            wanted = Boolean.parseBoolean(sc.nextLine());

        }while (wanted);

    }
}
