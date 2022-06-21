package coursAlex.competitionSportive.models;

import coursAlex.competitionSportive.models.Sportif;
import java.util.ArrayList;

public class Competition {
    private int limiteParticipants;
    private ArrayList<Sportif> sportifs;
    private Boolean isFinish;

    public Competition( int limiteParticipants){
        this.limiteParticipants = limiteParticipants;
        this.sportifs=new ArrayList<>();
        this.isFinish = false;
    }
    public void lancer() throws Exception {
        if(this.isFinish) throw new Exception("la competetion est terminée");
        for ( Sportif sportif: this.sportifs ) {
            int score = sportif.performer();
            sportif.setPerformance(score);
        }
        this.bubbleSortSportifs(sportifs);
        this.setIsFinish();
    }
    public void inscrire(Sportif sportif) throws Exception {
        if(this.isFinish) throw new Exception("la competetion est terminée");
        if(this.sportifs.size() >= this.limiteParticipants) throw new Exception("le nombre max de participant est atteind");
        if(this.sportifs.contains(sportif)) throw new Exception("ce sportif est deja dans cette competition");
        this.sportifs.add(sportif);
    }
    public void desinscrire(Sportif sportif) throws Exception {
        if(!this.sportifs.contains(sportif)) throw new Exception("ce sportif n'est pas dans cette competition");
        if(this.isFinish) throw new Exception("la competetion est terminée");
        this.sportifs.remove(sportif);
    }
    public String getWinner() {
        Sportif winner = sportifs.get(sportifs.size()-1);
        return winner.getFirstName() + " " + winner.getLastName();
    }
    public void setIsFinish(){
        this.isFinish = !this.isFinish;
    }
    public int getLimiteParticipants(){
        return this.limiteParticipants;
    }
    public ArrayList<Sportif> getSportifs() {
        return sportifs;
    }

    void bubbleSortSportifs(ArrayList <Sportif> sportifsList) {
        int n = sportifsList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sportifsList.get(j).getPerformance() > sportifsList.get(j + 1).getPerformance()) {
                    Sportif temp = sportifsList.get(j);
                    sportifsList.set(j, sportifsList.get(j + 1));
                    sportifsList.set((j + 1), temp);
                }
            }
        }
    }


}
