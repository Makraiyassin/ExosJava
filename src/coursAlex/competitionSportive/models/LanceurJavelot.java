package coursAlex.competitionSportive.models;

import java.util.Random;

public class LanceurJavelot extends Sportif {
    private int force;
    private int anneeExp;

    public LanceurJavelot(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
        this.force = new Random().nextInt(21)+30;
        this.anneeExp = new Random().nextInt(21);
    }
    public int performer() {
        double percentage = (new Random().nextInt(21)+70)/100.0;
        double result = (double) this.force + this.anneeExp * percentage;
        return (int) result ;
    }
}
