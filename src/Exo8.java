import java.util.BitSet;
import java.util.Scanner;
public class Exo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de ball avez-vous dans votre panier? ");
        int basket =   Integer.parseInt(sc.nextLine());

        boolean ready;

        while (basket>0){
            System.out.println("\n\n êtes-vous prêt? (true/false)\n");
            ready = Boolean.parseBoolean((sc.nextLine())) ;

            if(ready){
                System.out.printf("\n Lancé de balle! \n il reste %s dans le panier", basket-1);
                basket--;
            }else{
                System.out.printf("pas prêt", basket-1);
                break;
            };
        }
    }
}
