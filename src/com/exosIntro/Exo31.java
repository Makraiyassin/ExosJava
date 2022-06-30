import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exo31 {
    public static void main(String[] args) {

//        ● exo31-Réalisez un algorithme dans lequel nous devons rechercher une valeur (entrée
//                par l'utilisateur) dans un tableau d'entiers.

        Scanner sc = new Scanner(System.in);
        Integer[] myTab = new Integer[]{1,2,3,4,5,6,7,8,9} ;

        System.out.println("entrez un nombre entier: ");

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(myTab)) ;

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < myList.size() ; i++) {
            if (n == myList.get(i)) {
                System.out.printf("l'element se trouve à l'index %s",i);
                break;
            }
        }
    }
}
