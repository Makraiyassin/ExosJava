package com.bxlFormation.exosIntro;

public class Exo34 {
    public static void main(String[] args) {
//        exo34-Réalisez une fonction de recherche dans un tableau. Cette fonction va
//        recevoir un tableau, la taille du tableau, et la valeur recherchée en paramètres et
//        renvoyer l’indice de l’élément dans le tableau. Si l’élément ne s’y trouve pas, la
//        fonction renvoie -1.

        int[] tab2 = new int[]{51,5,22,4,40,45,6,62,45};
        System.out.println(getIndex(45,tab2));

    }
    static int getIndex(int valeur, int[]tab){
        for(int i=0; i<tab.length; i++){
            if (valeur == tab[i]){
                return i;
            }
        }
        return -1;
    }
}
