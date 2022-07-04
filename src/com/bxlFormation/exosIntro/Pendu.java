package com.bxlFormation.exosIntro;

import java.util.*;

public class Pendu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        String[] words = new String[]{"VOITURE", "TELEPHONE", "SAC","REUNION", "POMME", "SOURIS","ABEILLE","MIEL","RAT","CHIEN","CHAT","BEBE","MAMAN"};
        String word = words[rng.nextInt(words.length-1)];

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
        ArrayList<String> guessedWord = new ArrayList<>(Arrays.asList(new String[word.length()]));

        System.out.println("choissis ton niveau:\n facile (1) \n moyen (2) \n difficile (3)\n");
        int lvl =   Integer.parseInt(sc.nextLine());
        int tries = lvl == 3 ? 3 : lvl == 2 ? 5 : 7;

        while(true){
            System.out.println("entrez une lettre: ");
            String choisedLeter =   sc.nextLine().toUpperCase();
            if (wordList.contains(choisedLeter)){
                for (int i = 0; i < wordList.size(); i++) {
                    if (wordList.get(i).equals(choisedLeter)){
                        guessedWord.set(i,choisedLeter);
                    }
                }
            }else{
                tries--;
            }
            System.out.println(wordList+"\n"+guessedWord+"\n"+tries);

            if(tries==0 ){
                System.out.println("perdu");
                break;
            } else if(wordList.equals(guessedWord)) {
                System.out.println("gagné");
                break;
            }
        }
    }
}
