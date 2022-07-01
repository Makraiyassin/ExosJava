package com.bxlFormation.exosIntro;

import java.util.Scanner;
import java.util.HashMap;

public class Exo9 {
    public static void main(String[] args) {
        HashMap<String,Integer> stock = new HashMap<String,Integer>();
        stock.put("coca", 3);
        stock.put("fanta", 2);
        stock.put("iceTea", 0);
        stock.put("redBull", 1);

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Entrez le numéro de la boisson de votre choix\n Coca-cola : 1\n fanta orange : 2\n ice tea : 3\n red bull : 4\n"
        );

        int drink =   Integer.parseInt(sc.nextLine());
//        int drink = 2;

        switch (drink){
            case 1:
                if(stock.get("coca")>0){
                    stock.put("coca", stock.get("coca") -1);
                    System.out.printf("Vous recevez un coca-cola\n il reste %s coca", stock.get("coca"));
                }else{
                    System.out.println("il n'y a plus de coca");
                }

                break;
            case 2:
                if(stock.get("fanta")>0){
                    stock.put("fanta", stock.get("fanta")-1);
                    System.out.printf("Vous recevez un fanta\n il reste %s coca", stock.get("fanta"));
                }else{
                    System.out.println("il n'y a plus de fanta");
                }
                break;
            case 3:
                if(stock.get("iceTea")>0){
                    stock.put("iceTea", stock.get("iceTea")-1);
                    System.out.printf("Vous recevez un ice tea\n il reste %s ice tea", stock.get("iceTea"));
                }else{
                    System.out.println("il n'y a plus de ice tea");
                }
                break;
            case 4:
                if(stock.get("redBull")>0){
                    stock.put("redBull", stock.get("redBull")-1);
                    System.out.printf("Vous recevez un red bull\n il reste %s red bull", stock.get("redBull"));
                }else{
                    System.out.println("il n'y a plus de red bull");
                }
                break;
            default:
                System.out.println("Vous ne recevez rien");
                break;

        }
    }
}
