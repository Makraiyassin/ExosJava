import java.util.Arrays;
import java.util.Scanner;

public class Exo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myTab = new int[10];
        for(int i = 0; i<myTab.length; i++){
            System.out.println("entrez un nombre entier:, n ");
            myTab[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.stream(myTab).min());
    }
}




