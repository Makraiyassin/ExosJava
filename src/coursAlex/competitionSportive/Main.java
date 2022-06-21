package coursAlex.competitionSportive;

import coursAlex.competitionSportive.models.Competition;
import coursAlex.competitionSportive.models.Sportif;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("combien de participants?");
//        int limiteParticipants = Integer.parseInt(sc.next());
        int limiteParticipants = 3;

        Competition league = new Competition(limiteParticipants);
        try{
            Sportif yassin = new Sportif("yassin", "makrai", "21/06/1992");
            Sportif picsou = new Sportif("picsou", "disney", "01/01/2020");
            Sportif azert = new Sportif("azert", "qwerty", "01/01/2020");
            league.inscrire(yassin);
            league.inscrire(picsou);
            league.inscrire(azert);
            league.desinscrire(picsou);

            //#region  programme d'encodage en commentaire
//                        for (int i = 0; i < league.getLimiteParticipants(); i++) {
//                            System.out.printf("\n nom du sportif %s: ",i+1);
//                            String lastName = sc.next();
//                            System.out.printf("\n prénom du sportif %s: ",i+1);
//                            String firstName = sc.next();
//                            System.out.printf("\n date de naissance du sportif %s(xx/xx/xxxx): ",i+1);
//                            String birthDay = sc.next();
//                            Sportif sportifTmp = new Sportif(lastName, firstName, birthDay);
//                            league.inscrire(sportifTmp);
//                        }
            //endregion

            league.lancer();
            System.out.println("les participans par ordre de leur performances: ");
            System.out.println(league.getSportifs());
            System.out.println("gagnant: " + league.getWinner()+ " !!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
