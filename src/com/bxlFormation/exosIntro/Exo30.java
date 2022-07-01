package com.bxlFormation.exosIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class Exo30 {
    public static void main(String[] args) {
//        ● exo30-En considérant un tableau d'entiers trié dans l'ordre croissant, réalisez un
//        algorithme étant capable d'insérer une nouvelle valeur dans le tableau de façon à ce
//        que le tableau reste trié. Le but n'est évidemment pas d'insérer la valeur à la fin et de
//        trier après mais bien de l'insérer au bon endroit directement.

        Integer[] myTab = new Integer[]{1,2,3,4,5,6,7,8,9,0} ;

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(myTab)) ;
        int n = 4;

        for(int i = 0; i < myList.size() ; i++) {
            if (n< myList.get(i)) {
                myList.add(i,n);
                break;
            }
        }

        System.out.println(myList);
    }
}
