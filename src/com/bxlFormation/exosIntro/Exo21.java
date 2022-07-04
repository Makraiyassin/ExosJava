package com.bxlFormation.exosIntro;

import java.util.Random;
import java.util.Scanner;

public class Exo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez votre niveau\n facile: 1\n normal: 2\n difficile: 3 \n ");
        String tmp = sc.nextLine();
        int lvl = estEntier(tmp) ? Integer.parseInt(tmp) : 1;
        int max = lvl == 3 ? 1000 : lvl == 2 ? 100 : 10;
        rightPrice(max);
    }
    static String plusMoins(int numberToGuess, int guessNumber){
        if(guessNumber>numberToGuess){
            return "c'est moins";
        } else if(guessNumber<numberToGuess) {
            return "c'est plus";
        }
        return "C’est gagné";
    }
    static boolean estEntier(String chaine) {
        try {
            Integer.parseInt(chaine);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    static void rightPrice(int max){
        Scanner sc = new Scanner(System.in);
        Random rng=  new Random();
        int numberToGuess= rng.nextInt(max);
        System.out.println("entrez un nombre: ");
        String tmp = sc.nextLine();
        int guessNumber = estEntier(tmp) ? Integer.parseInt(tmp) : -1;
        int count = 9;

        while(true){
            if (count==0) {
                System.out.printf("il ne vous reste plus d'essais... le juste prix était %s !", numberToGuess);
                break;
            } else if (guessNumber == -1) {
                System.out.printf("Veuillez entrer un nombre valide: ", numberToGuess);
                tmp = sc.nextLine();
                guessNumber = estEntier(tmp) ? Integer.parseInt(tmp) : -1;
            } else if (numberToGuess != guessNumber) {
                System.out.println(plusMoins(numberToGuess, guessNumber));
                System.out.printf("il reste %s essais!", count);
                System.out.println("entrez un nombre: ");
                tmp = sc.nextLine();
                guessNumber = estEntier(tmp) ? Integer.parseInt(tmp) : -1;
                count--;
            }else{
                System.out.println(plusMoins(numberToGuess, guessNumber));
                break;
            }
        }

    }
}

