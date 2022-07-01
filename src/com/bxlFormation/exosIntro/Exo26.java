package com.bxlFormation.exosIntro;

public class Exo26 {
    public static void main(String[] args) {
        int [] myTab = new int[] {4,7,2,456,14,5,452,48,5,52};
        int count = 0;
//        boolean permutation;
//        int passage=0;
//        do {
//            permutation = false;
            for (int i = 0; i < myTab.length; i++) {
                for (int j = 0; j < (myTab.length - 1) - i; j++){
//                for (int j = 0; j < (myTab.length - 1) - passage; j++){
                    if (myTab[j] > myTab[j + 1]) {
                        int tmp = myTab[j];
                        myTab[j] = myTab[j + 1];
                        myTab[j + 1] = tmp;
                        count++;
//                        permutation = true;
                    }
                    count++;
                }
            }
//            passage ++;
//        }while(permutation);

        System.out.println(count);
        for(int elem : myTab ){
            System.out.println(elem);
        }
    }


}




