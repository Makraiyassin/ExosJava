package com.coursAlex.competitionSportive.interfaces;

import com.coursAlex.competitionSportive.models.Sportif;
import java.util.Set;

public interface iCompetition<S extends Sportif> {

    // Cette interface me permet de rester dans le cadre de l'énoncé
    public interface Competition<S>{

        void lancer();
        void inscrire(S sportif);
        void desinscrire(S sportif);
        Set<S> getGagnants();
        boolean isTerminee();

        int getLimiteParticipant();

    }
}
