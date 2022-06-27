package coursAlex.competitionSportive;

import coursAlex.competitionSportive.Exceptions.LimiteAtteinteExceptions;
import coursAlex.competitionSportive.Exceptions.EtatCompetitionExceptions;
import coursAlex.competitionSportive.enumerations.Localisation;
import coursAlex.competitionSportive.models.Competition;
import coursAlex.competitionSportive.models.Coureur;
import coursAlex.competitionSportive.models.Sportif;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Competition<Coureur> league = new Competition<>("league02",Localisation.REGIONAL);

        try{
//#region encodage manuel en commentaire
//            Coureur yassin = new Coureur("Yassin", "Makrai", "21/06/1992");
//            Coureur picsou = new Coureur("Picsou", "Disney", "01/01/2020");
//            Coureur donald = new Coureur("Donald", "Disney", "01/01/2020");
//            Coureur azerty = new Coureur("Azerty", "Qwerty", "01/01/2020");
//            league.inscrire(yassin);
//            league.inscrire(picsou);
//            league.inscrire(donald);
//            league.inscrire(azerty);
//            league.desinscrire(picsou);
//endregion
//#region  programme d'encodage en commentaire
//                        for (int i = 0; i < league.getLimiteParticipants(); i++) {
//                            System.out.printf("\n nom du sportif %s: ",i+1);
//                            String lastName = sc.next();
//                            System.out.printf("\n prénom du sportif %s: ",i+1);
//                            String firstName = sc.next();
//                            System.out.printf("\n date de naissance du sportif %s(xx-xx-xxxx): ",i+1);
//                            String birthDay = sc.next();
//                            Coureur sportifTmp = new Coureur(lastName, firstName, birthDay);
//                            Coureur sportifTmp = new Coureur("lastName", "firstName", "01-01-2020");
//                            league.inscrire(sportifTmp);
//                        }
//endregion
            String fileName ="src/coursAlex/competitionSportive/ressources/league01_2022-06-24.txt";
            createCompetitionWithSaveFile(fileName, league);
            league.sauvegarderInscrits();
            league.lancer();
        } catch (EtatCompetitionExceptions | LimiteAtteinteExceptions | IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("les participans par ordre de leur performances: ");
        System.out.println(league.getSportifs());
        System.out.println("gagnant(s): " + league.getWinner());

    }
    public static <Type extends Sportif> void createCompetitionWithSaveFile(String fileName, Competition<Type> competition){
        try(FileReader fr = new FileReader(fileName)){
            int data = fr.read();
            StringBuilder competitionFile = new StringBuilder();
            while (data != -1){
                competitionFile.append((char) data);
                data = fr.read();
            }
            String[] competitionFileTab =  competitionFile.toString().split("\n");
            System.out.println(Arrays.toString(competitionFileTab));
            for (int i = 1; i < competitionFileTab.length; i++) {
                String[] participantTabTmp = competitionFileTab[i].split(",");

                competition.inscrire(new Type(participantTabTmp[0],participantTabTmp[1],participantTabTmp[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
