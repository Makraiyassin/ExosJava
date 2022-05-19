import java.util.Scanner;

public class Exo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myTab = new int[] {2, 4, 8, 16, 32, 64,128, 256, 512, 1024 };
        System.out.println("entrez une valeur du tableau afin d'en connaitre la position:  ");
        int valeur = Integer.parseInt(sc.nextLine());
        boolean isIn = true;

        for(int i=0; i<myTab.length; i++){
            if (valeur == myTab[i]){
                System.out.printf("la valeur %s se trouve à l'index %s", valeur, i);
                isIn=false;
            }
        }

        if(isIn){
            System.out.println("la valeur ne se trouve pas dans le tableau");
        }
    }
}
