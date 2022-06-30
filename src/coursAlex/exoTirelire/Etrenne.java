package coursAlex.exoTirelire;

public class Etrenne extends Thread{
    private final int secondes;
    private final int montant;
    private final Tirelire tirelire;
    private final int montantMax;
    private boolean stop;

    public Etrenne(int secondes, int montant, Tirelire tirelire, int montantMax) {
        this.secondes = secondes;
        this.montant = montant;
        this.tirelire = tirelire;
        this.montantMax = montantMax;
        this.stop = false;
    }

    public void run(){
        synchronized (this){
            try {
                while(!this.stop){
                    Thread.sleep(this.secondes * 1000L);
                    this.tirelire.addArgent(montant);
                    System.out.println(Thread.currentThread().getName()+" - je rajoute "+this.montant+ " - tirelire: "+ this.tirelire.getArgent());
//                    if(this.tirelire.getArgent()>=montantMax) this.stopEtrenne();
                    if(this.tirelire.getArgent()>=montantMax) break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopEtrenne(){
        this.stop = true;
        System.out.println("je stop l'etrenne");
    }
}
