package com.bxlFormation.coursAlex.exoTirelire;

public class Etrenne extends Thread{
    private final int secondes;
    private final int montant;
    private final Tirelire tirelire;
    private boolean stop;

    public Etrenne(int secondes, int montant, Tirelire tirelire) {
        this.secondes = secondes;
        this.montant = montant;
        this.tirelire = tirelire;
        this.stop = false;
    }

    @Override
    public void run(){
        try {
            while(!this.stop){
                this.tirelire.addArgent(montant);
                System.out.println(Thread.currentThread().getName()+" - je rajoute "+this.montant+ " - tirelire: "+ this.tirelire.getArgent());
                Thread.sleep(this.secondes * 1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopEtrenne(){
        this.stop = true;
        System.out.println("etrenne stoppee");
    }
}
