package coursAlex.competitionSportive.interfaces;

import coursAlex.competitionSportive.models.Sportif;
import java.util.Set;

public interface iCompetition<S> {

    // Cette interface me permet de rester dans le cadre de l'énoncé
    public interface Competition {

        void lancer();
        void inscrire(Sportif sportif);
        void desinscrire(Sportif sportif);
        Set<Sportif> getGagnants();
        boolean isTerminee();

        int getLimiteParticipant();

    }
}
