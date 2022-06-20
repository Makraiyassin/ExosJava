package coursAlex.competitionSportive.models;

import java.util.Random;

public class Sportif {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private int performance;

    public Sportif (String nom, String prenom, String dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public int performer() {
        Random rand = new Random();
        return rand.nextInt(100)+1;
    }
    public String getLastName(){
        return this.nom;
    }
    public String getFirstName(){
        return this.prenom;
    }
    public int getPerformance(){
        return this.performance ;
    }
    public void setPerformance(int performance){
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "\nSportif{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", performance=" + performance +
                '}';
    }
}
