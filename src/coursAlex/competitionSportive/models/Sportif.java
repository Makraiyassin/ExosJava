package coursAlex.competitionSportive.models;

import java.util.Random;

public abstract class Sportif {
    private final String nom;
    private final String prenom;
    private final String dateNaissance;
    private int performance;
    private int totalGain;
    public Sportif (String nom, String prenom, String dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
    public abstract int performer();
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
    public int getTotalGain() {
        return totalGain;
    }
    public void setTotalGain(int totalGain) {
        this.totalGain = totalGain;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }

    @Override
    public String toString() {
        return "\nSportif{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", performance=" + performance +
                ", totalGain=" + totalGain +
                '}';
    }
}
