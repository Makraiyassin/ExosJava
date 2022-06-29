package coursAlex.exoThread;

public class Moteur {
    private int puissance;

    public Moteur(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "puissance=" + puissance +
                '}';
    }
}
