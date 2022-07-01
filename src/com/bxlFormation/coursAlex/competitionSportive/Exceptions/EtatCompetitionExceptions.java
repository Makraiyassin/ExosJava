package com.bxlFormation.coursAlex.competitionSportive.Exceptions;

public class EtatCompetitionExceptions extends IllegalStateException{
    private final boolean etatCourant;
    private final boolean etatAttendu;

    public EtatCompetitionExceptions(boolean etatCourant, boolean etatAttendu) {
        super("la competion est "+(etatCourant?"":"non")+ " terminée");
        this.etatCourant = etatCourant;
        this.etatAttendu = etatAttendu;
    }
}
