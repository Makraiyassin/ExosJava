package com.bxlFormation.exosIntro;

import java.nio.charset.StandardCharsets;

public class HelloWorld {

    public static void main(String[] args) {
        int a = 4;
        double b = 2.5;
        boolean c = false;
        String message = "Bonjour tout le monde";

        if (c==true){
            System.out.println("hello world: " + a*b);
        }else{
            System.out.println(message.toUpperCase());
        }
    }
}
