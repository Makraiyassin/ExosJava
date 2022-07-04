package com.bxlFormation.exosIntro;

import java.util.Scanner;

public class Exo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quelle est votre note: ");
        int score =   Integer.parseInt(sc.nextLine());

        if(score<=20 && score>=19){
            System.out.println("Excellent");
        }else if(score<=18 && score>=16){
            System.out.println("TB");
        }else if(score<=15 && score>=13){
            System.out.println("B");
        }else if(score<=12 && score>=11){
            System.out.println("S");
        }else if(score<=10 && score>=0){
            System.out.println("I");
        }else{
            System.out.println("Error");
        }
    }
}
