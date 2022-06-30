package com.coursAlex.exoTirelire;

public class Main {
    public static void main(String[] args) {

        Tirelire tirelire = new Tirelire(10);
        Etrenne etren = new Etrenne(1,10, tirelire);
        Thread t = new Thread(etren::start);
        t.start();
        try {
            Thread.sleep(10_000);
            System.out.println("thread " +Thread.currentThread().getName()+" - je met fin a l'etrenne");
            etren.stopEtrenne();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
