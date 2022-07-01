package com.bxlFormation.exosIntro;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Entrez la valeur de a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez la valeur de b: ");
        int b = Integer.parseInt(sc.nextLine());
        int tmp = a;
        a=b;
        b=tmp;
//        InverseInt(a,b);
        System.out.println("nouvelle valeur a "+a);
        System.out.println("nouvelle valeur b "+b);
    }
//    static void InverseInt(int int1, int int2){
//        int tmp = int1;
//        int1=int2;
//        int2=tmp;
//    }
}
