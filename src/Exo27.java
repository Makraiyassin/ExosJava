import java.util.Arrays;
import java.util.Scanner;

public class Exo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myTab = new int[10];
        for(int i = 0; i<myTab.length; i++){
            System.out.println("entrez un nombre entier:  ");
            myTab[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("le plus petit nombre est: "+bubbleSort(myTab)[0]);
    }
    static int[] bubbleSort(int[] myTab){
        for (int i = 0; i < myTab.length; i++) {
            for (int j = 0; j < (myTab.length - i) - 1; j++){
                if (myTab[j] > myTab[j + 1]) {
                    int tmp = myTab[j];
                    myTab[j] = myTab[j + 1];
                    myTab[j + 1] = tmp;
                }
            }
        }
        return myTab;
    }
}

