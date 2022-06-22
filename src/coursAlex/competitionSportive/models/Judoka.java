package coursAlex.competitionSportive.models;

import java.util.Random;

public class Judoka extends Sportif {

    private int puissanceProjection;


    public Judoka(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
        this.puissanceProjection = new Random().nextInt(41)+40;
    }

    public double performer() {
        return (double) puissanceProjection + (new Random().nextInt(41)-20);
    }

}
