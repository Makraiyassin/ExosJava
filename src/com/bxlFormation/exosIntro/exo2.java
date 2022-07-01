package com.bxlFormation.exosIntro;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre prénom: ");
        String firstName = sc.nextLine();
        System.out.println("Entrez votre nom: ");
        String lastName = sc.nextLine();
        System.out.println("Bienvenue "+firstName+" "+lastName);
        System.out.println(String.format("hello %s %s !",firstName,lastName));
    }
}
