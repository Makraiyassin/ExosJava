package com.bxlFormation.coursAlex.competitionSportive;

import com.bxlFormation.coursAlex.competitionSportive.Exceptions.EtatCompetitionExceptions;
import com.bxlFormation.coursAlex.competitionSportive.Exceptions.LimiteAtteinteExceptions;
import com.bxlFormation.coursAlex.competitionSportive.enumerations.Localisation;
import com.bxlFormation.coursAlex.competitionSportive.models.Competition;
import com.bxlFormation.coursAlex.competitionSportive.models.Coureur;
import com.bxlFormation.coursAlex.competitionSportive.models.Sportif;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
//        Scanner sc = new Scanner(System.in);
        Competition<Coureur> league = new Competition<>("league02", Localisation.REGIONAL,Coureur.class);
//#region encodage manuel (en commentaire)
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
//#region  programme d'encodage (en commentaire)
                        for (int i = 0; i < league.getLimiteParticipants(); i++) {
//                            System.out.printf("\n nom du sportif %s: ",i+1);
//                            String lastName = sc.next();
//                            System.out.printf("\n prénom du sportif %s: ",i+1);
//                            String firstName = sc.next();
//                            System.out.printf("\n date de naissance du sportif %s(xx-xx-xxxx): ",i+1);
//                            String birthDay = sc.next();
//                            Coureur sportifTmp = new Coureur(lastName, firstName, birthDay);
                            Coureur sportifTmp = new Coureur("Makrai", "Yassin", "01-01-2020");
                            league.inscrire(sportifTmp);
                        }
//endregion

//            String fileName ="src/coursAlex/competitionSportive/ressources/league02_2022-06-27.txt";
//            createCompetitionWithSaveFile(fileName, Judoka.class);

//            league.sauvegarderInscrits();
            league.lancer();
            league.getSportifs().stream()
                    .filter(s -> s.getPerformance()>20)
                    .map(Sportif::getFirstName)
                    .forEach(System.out::println);
//            System.out.println("gagnant(s): " + league.getWinner());
        } catch (EtatCompetitionExceptions | LimiteAtteinteExceptions | IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static <Type extends Sportif> void createCompetitionWithSaveFile(String fileName, Class<Type> clazz){
        Competition<Type> competition = new Competition<>("league03",Localisation.REGIONAL, clazz);

        try(FileReader fr = new FileReader(fileName)){
            int data = fr.read();
            StringBuilder competitionFile = new StringBuilder();
            while (data != -1){
                competitionFile.append((char) data);
                data = fr.read();
            }
            String[] competitionFileTab =  competitionFile.toString().split("\n");

            for (int i = 2; i < competitionFileTab.length; i++) {
                String[] participantTabTmp = competitionFileTab[i].split(",");
                competition.inscrire(clazz.getConstructor(String.class, String.class,String.class).newInstance(participantTabTmp[0],participantTabTmp[1],participantTabTmp[2]));
//                competition.inscrire(new Type(participantTabTmp[0],participantTabTmp[1],participantTabTmp[2]));
            }
            competition.sauvegarderInscrits();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
