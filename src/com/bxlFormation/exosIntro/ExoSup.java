package com.bxlFormation.exosIntro;

import java.util.Random;
import java.util.Scanner;

public class ExoSup {
    public static void main(String[] args) {
//        1. Réalisez un système de connexion à l'aide d'un mot de passe. L'algorithme demande à
//        l'utilisateur de saisir son mot de passe. Si ce dernier valide de bon mot de passe, on le
//        salue. Par contre, si il fait une erreur trois fois de suite, un message lui signalera que son
//        compte est bloqué et il ne pourra pas réessayer une quatrième fois

        Scanner sc = new Scanner(System.in);
//        final String PASSWORD = "Abcdef123!";
//        System.out.println("\nentrez votre mot de passe: ");
//        String password = sc.nextLine();
//        System.out.println(connexion(PASSWORD,password));

//        1. Ecrivez un algorithme qui demande à l’utilisateur de taper 10 entiers et qui affiche le plus
//        petit de ces entiers.

//        System.out.println("\nentrez entrez un nombre entier: ");
//        int min = Integer.parseInt(sc.nextLine());
//
//        for(int i = 0; i <= 10; i++){
//            System.out.println("\nentrez entrez un nombre entier: ");
//            int number = Integer.parseInt(sc.nextLine());
//            min = min > number ? number : min;
//        }
//
//        System.out.printf("le plus petit entier est: %s ",min);

//        1. Algorithme demandant 3 nombres : nbRep, nbTiret, nbEspace. Ce dernier affiche à
//        l'écran autant de tiret que la valeur de nbTiret, suivi d'autant d'espace que la valeur de
//        nbEspace. Le tout autant de fois que la valeur de nbRep.Exemple : si nbRep = 2, nbTiret
//                = 1 et nbEspace = 3 le résultat est le suivant :-  -

//        System.out.println("\nentrez entrez un nombre de fois: ");
//        int nbRep = Integer.parseInt(sc.nextLine());
//        System.out.println("\nentrez entrez un nombre tiret: ");
//        int nbTiret = Integer.parseInt(sc.nextLine());
//        System.out.println("\nentrez entrez un nombre espace: ");
//        int nbEspace = Integer.parseInt(sc.nextLine());
//        String result = "";
//        for(int i = 0; i<nbRep; i++){
//            for(int j = 0; j<nbTiret;j++){
//                result+="-";
//            }
//            for(int k = 0; k<nbEspace;k++){
//                result+=" ";
//            }
//        }
//        System.out.println(result);

    }
    static String connexion(String PASSWORD, String password){
        Scanner sc = new Scanner(System.in);
        int Try = 3;
        while (Try>1){
            if(PASSWORD.equals(password)){
                return "Salut !";
            }else{
                Try--;
                System.out.printf( "\nle mot de passe est incorect,\n il vous reste %s essais\n reéssayez...",Try);
                System.out.println("\nentrez votre mot de passe: ");
                password = sc.nextLine();
            }
        }
        return "Votre compte est bloqué";
    }
}

