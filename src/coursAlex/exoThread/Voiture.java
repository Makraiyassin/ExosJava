package coursAlex.exoThread;

import java.util.ArrayList;

public class Voiture {
    private Carcasse carcasse;
    private ArrayList<Roue> roues;
    private Moteur moteur;

    public Voiture(Carcasse carcasse, Moteur moteur,ArrayList<Roue> roues) {
        this.carcasse = carcasse;
        this.moteur = moteur;
        this.roues = roues;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "carcasse=" + carcasse +
                ", roues=" + roues +
                ", moteur=" + moteur +
                '}';
    }
}
