package coursAlex.competitionSportive.models;

import java.util.Random;

public abstract class Sportif {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private double performance;
    public Sportif (String nom, String prenom, String dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
    public abstract double performer();
    public String getLastName(){
        return this.nom;
    }
    public String getFirstName(){
        return this.prenom;
    }
    public double getPerformance(){
        return this.performance ;
    }
    public void setPerformance(double performance){
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
