package com.bxlFormation.coursAlex.exoTirelire;

public class Tirelire {
    private int argent;

    public Tirelire(int argent) {
        this.argent = argent;
    }

    public int getArgent() {
        return argent;
    }
    public void addArgent(int argent) {
        this.argent += argent;
    }
}
