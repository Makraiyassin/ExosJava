package coursAlex.ExoStream;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        VilleService service = new VilleService();
        // TODO testez vos methodes
        System.out.println("methode pour avoir la ville avec la taxe la plus élevée: ");
        System.out.println( service.getWithHighestTaxe());
        System.out.println("\nmethode pour avoir le nom des villes: ");
        System.out.println(service.getCityNames());
        System.out.println("\nmethode pour avoir le nom des rues de toutes les villes sans doublons: ");
        System.out.println(service.getStreets());;
        System.out.println("\nmethode pour le payement de taxe (initial en parametre): ");
        service.taxe('q');
        System.out.println("===========================");
        System.out.println("\nmethode pour avoir l'habitant le plus taxé: ");
        System.out.println(service.getMostTaxed());
    }
}
