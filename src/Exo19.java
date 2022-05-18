import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre: ");
        int N =   Integer.parseInt(sc.nextLine());
        int puissance = 10;
        int resultat = 1;

        int i = 1;
        while (i<=puissance){
            resultat*= N;
            i++;
        }
        System.out.println(resultat);
    }
}
