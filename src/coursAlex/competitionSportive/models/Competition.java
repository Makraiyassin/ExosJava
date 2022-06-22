package coursAlex.competitionSportive.models;

import coursAlex.competitionSportive.Exceptions.EtatCompetitionExceptions;
import coursAlex.competitionSportive.Exceptions.LimiteAtteinteExceptions;
import coursAlex.competitionSportive.interfaces.iCompetition;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Competition<S extends Sportif> implements iCompetition<S> {
    private final  int limiteParticipants;
    private final ArrayList<S> sportifs;
    private Boolean isFinish;
    public Competition( int limiteParticipants){
        if(limiteParticipants < 0) throw new IllegalArgumentException("la limite de participants doit etre superieur à 0");
        this.limiteParticipants = limiteParticipants;
        this.sportifs=new ArrayList<>();
        this.isFinish = false;
    }
    public void lancer() throws Exception {
        if(this.isFinish) throw new Exception("la competetion est terminée");
        for ( S sportif: this.sportifs ) {
            double score = sportif.performer();
            sportif.setPerformance(score);
        }
        this.SortSportifsDesc(sportifs);
        this.setIsFinish();
    }
    public void inscrire(S sportif) throws LimiteAtteinteExceptions, EtatCompetitionExceptions, IllegalArgumentException {
        if(this.isFinish) throw new EtatCompetitionExceptions( this.isFinish, false);
        if(this.limiteParticipants!=0 && this.sportifs.size() >= this.limiteParticipants) throw new LimiteAtteinteExceptions(this.limiteParticipants);
        if(this.sportifs.contains(sportif)) throw new IllegalArgumentException("ce sportif est deja dans cette competition");
        this.sportifs.add(sportif);
    }
    public void desinscrire(S sportif) throws EtatCompetitionExceptions,IllegalArgumentException {
        if(this.isFinish) throw new EtatCompetitionExceptions(this.isFinish,false);
        if(!this.sportifs.contains(sportif)) throw new IllegalArgumentException("ce sportif n'est pas dans cette competition");
        this.sportifs.remove(sportif);
    }
    public String getWinnerDraft() {
        S winner = sportifs.get(sportifs.size()-1);
        return winner.getFirstName() + " " + winner.getLastName();
    }
    public Set<S> getWinner() {
        double maxPerf = sportifs.get(0).getPerformance();
        return this.sportifs
                .stream()
                .filter(e->e.getPerformance() == maxPerf)
                .collect(Collectors.toSet());
    }
    public void setIsFinish(){
        this.isFinish = !this.isFinish;
    }
    public int getLimiteParticipants(){
        return this.limiteParticipants;
    }
    public ArrayList<S> getSportifs() {
        return sportifs;
    }

    private void SortSportifsDesc(ArrayList <S> sportifsList) {

        int n = sportifsList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sportifsList.get(j).getPerformance() < sportifsList.get(j + 1).getPerformance()) {
                    S temp = sportifsList.get(j);
                    sportifsList.set(j, sportifsList.get(j + 1));
                    sportifsList.set((j + 1), temp);
                }
            }
        }
    }
}
