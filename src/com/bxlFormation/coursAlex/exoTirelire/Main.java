package com.bxlFormation.coursAlex.exoTirelire;

public class Main {
    public static void main(String[] args) {

        Tirelire tirelire = new Tirelire(0);

        Etrenne etren = new Etrenne(1,10, tirelire);
        etren.start();

        Etrenne etren2 = new Etrenne(1,7, tirelire);
        etren2.start();

        Etrenne etren3 = new Etrenne(1,5, tirelire);
        etren3.start();

        try {

            Thread.sleep(10_000);
            System.out.println("thread " +Thread.currentThread().getName()+" - je met fin a l'etrenne");
            etren.stopEtrenne();
            etren2.stopEtrenne();
            etren3.stopEtrenne();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
