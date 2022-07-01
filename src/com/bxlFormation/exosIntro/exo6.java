package com.bxlFormation.exosIntro;

public class exo6 {
    public static void main(String[] args) {
        int a=3,b=9,e=9;
        boolean c=false,d=!c;

        boolean result1 = a>8; //false
        boolean result2 = b == 9; //true
        boolean result3 = !(a!=3); //true
        boolean result4 = !c; //true
        boolean result5 = (a<b) || c; //true
        boolean result6 = !((a + b) != 12); //true
        boolean result7 = ((b == 5) || ( (e > 10) && (a < 8) )); //false
        boolean result8 = ((((b == 5) || ((e > 10) && (a < 8))) || (a < b) || c) && c); //false
    }
}
