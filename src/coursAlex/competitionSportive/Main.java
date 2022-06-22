package coursAlex.competitionSportive;

import coursAlex.competitionSportive.Exceptions.LimiteAtteinteExceptions;
import coursAlex.competitionSportive.models.Competition;
import coursAlex.competitionSportive.Exceptions.EtatCompetitionExceptions;
import coursAlex.competitionSportive.models.Coureur;
import coursAlex.competitionSportive.models.Judoka;
import coursAlex.competitionSportive.models.Sportif;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("combien de participants?");
//        int limiteParticipants = Integer.parseInt(sc.next());
        int limiteParticipants = 7;

        Competition<Coureur> league = new Competition<Coureur>(limiteParticipants);
        try{
            Coureur yassin = new Coureur("Yassin", "Makrai", "21/06/1992");
            Coureur picsou = new Coureur("Picsou", "Disney", "01/01/2020");
            Coureur donald = new Coureur("Donald", "Disney", "01/01/2020");
            Coureur azerty = new Coureur("Azerty", "Qwerty", "01/01/2020");
            league.inscrire(yassin);
            league.inscrire(picsou);
            league.inscrire(donald);
            league.inscrire(azerty);
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
            System.out.println("gagnant(s): " + league.getWinner());
        } catch (EtatCompetitionExceptions | LimiteAtteinteExceptions | IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
