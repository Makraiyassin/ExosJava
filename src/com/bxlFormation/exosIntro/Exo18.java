package com.bxlFormation.exosIntro;

import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {
//● exo18-À l’aide d’une boucle Faire … TantQue, améliorez l’algorithme de la calculatrice afin
//       qu’elle demande à l’utilisateur s’il veut faire un autre calcul (tant qu’il le désire).
//● exo19-À l’aide de la boucle TantQue … Faire, réalisez un algorithme calculant le résultat de
//        N10. N étant un nombre saisi par l’utilisateur.
//● exo20-Reprenez l’exercice précédent et modifiez-le pour que l’utilisateur entre
//        également l’exposant qu’il désire calculer

        Scanner sc = new Scanner(System.in);
        boolean wanted;

        do{
            System.out.println("entrez un nombre: ");
            int a =   Integer.parseInt(sc.nextLine());

            System.out.println("choisissez un operateur (+,-,*,/): ");
            String operator =  sc.nextLine();

            System.out.println("entrez un nombre: ");
            int b =   Integer.parseInt(sc.nextLine());

            System.out.println(calculator(a,operator,b));
            System.out.println("Voulez-vous faire un autre calcul? (true/false) ");
            wanted = Boolean.parseBoolean(sc.nextLine());
        }while (wanted);
    }
    static double calculator(double a,String operator, double b){
        double result=0;
        switch (operator){
            case "+":
                result= a+b;
                break;
            case "-":
                result= a-b;
                break;
            case "*":
                result= a*b;
                break;
            case "/":
                result= a/b;
                break;
            default:
                break;
        }
        return result;
    }
}
